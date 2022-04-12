package com.example.demo.java.base.javastar.second.homework;

import com.example.demo.java.base.javastar.second.homework.exception.MyException;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import static com.example.demo.java.base.javastar.second.homework.Global.*;


/**
 * @author 80307094
 */
@Slf4j
public class Main {
    private static final int REMAIN_MIN_POINTS = 10;
    private static final String RESULT_ERROR = "数量结果校验异常";
    private static final String RESULT_PRICE_ERROR = "价格结果校验异常";
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        // 1. 加载商品信息
        log.info("loading info");
        /**
         * 商品种类 0 ~ GOODS_NUM - 1 商品ID 0 ~ GOODS_NUM - 1
         * ArrayList用作商品存储
         * 商品描述为 商品种类_商品价格
         * */
        List<Good> goodsLib = new Vector<>(GOODS_NUM);
        List<User> usersLib = new Vector<>(USERS_NUM);
        List<BuyRecord> buyRecordsLib = new Vector<>(USERS_NUM * INIT_POINTS / 5);
        loadGoodsAndUsersInfo(goodsLib, usersLib);

        // 2. 模拟用户购买行为进行商品购买 可选多线程mul 单线程single
        log.info("buy");
        buyProcessMul(goodsLib, usersLib, buyRecordsLib);


        // 3. check
        try {
            check(goodsLib, usersLib);
        } catch (MyException e) {
            log.info("exception:{},code:{}", e, e.getCode());
        }

        // 4. 打印购买后的商品结果和用户数据
        log.info("print");
        prinResult(goodsLib, usersLib);

    }

    private static void prinResult(List<Good> goodsLib, List<User> usersLib) {
        for (int i = 0; i < PRINT_NUM; i++) {
            log.info("User:{}", usersLib.get(i).toString());
        }
        for (int i = 0; i < PRINT_NUM; i++) {
            log.info("Good:{}", goodsLib.get(i).toString());
        }
    }

    private static void check(List<Good> goodsLib, List<User> usersLib) throws MyException {
        int userBuyNum = 0;
        for (int i = 0; i < usersLib.size(); i++) {
            userBuyNum += usersLib.get(i).getTotalNum().size();
        }
        int goodNum = 0;
        for (int i = 0; i < goodsLib.size(); i++) {
            goodNum += (GOODS_RESOURCE_NUM - goodsLib.get(i).getInStock());
        }
        log.info("check_num_res:{}", userBuyNum == goodNum);
        if (userBuyNum != goodNum) {
            throw new MyException(001, RESULT_ERROR);
        }

        int userPrice = 0;
        for (int i = 0; i < usersLib.size(); i++) {
            for (int j = 0; j < usersLib.get(i).getTotalNum().size(); j++) {
                userPrice += usersLib.get(i).getTotalNum().get(j).getBuyPrice();
            }
        }
        int goodPrice = 0;
        for (int i = 0; i < goodsLib.size(); i++) {
            goodPrice += (goodsLib.get(i).getPrice() * (GOODS_RESOURCE_NUM - goodsLib.get(i).getInStock()));
        }

        log.info("check_price_res:{}", userPrice == goodPrice);
        if (userPrice != goodPrice) {
            throw new MyException(002, RESULT_PRICE_ERROR);
        }
    }


    private static void buyProcessMul(List<Good> goodsLib, List<User> usersLib, List<BuyRecord> buyRecordsLib) {
        Random random = new Random(10);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(6, 20, 600,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.CallerRunsPolicy());
        CountDownLatch countDownLatch = new CountDownLatch(20);
        for (int i = 0; i < USERS_NUM; i++) {
            /**
             * 多线程 总共启动 1000 / 50 = 20 个线程 每个线程做50个user的购买操作
             */
            if (i % 50 == 0) {
                int finalI = i;
                executor.execute(() -> {
                    for (int j = finalI; j < finalI + 50; j++) {
                        runThreadBuy(goodsLib, usersLib, buyRecordsLib, random, j);
                    }
                    countDownLatch.countDown();
                });
            }
        }
        try {
            countDownLatch.await();
        } catch (Exception e) {
            log.info("count error",e);
        }
        executor.shutdown();
    }

    /**
     *
     * @param goodsLib
     * @param usersLib
     * @param buyRecordsLib
     * @param random
     * @param j
     */
    private  static void runThreadBuy(List<Good> goodsLib, List<User> usersLib, List<BuyRecord> buyRecordsLib, Random random, int j) {
        lock.lock();
        try {
            singleUserBuy(goodsLib, usersLib, buyRecordsLib, random, j);
        } catch (Exception e) {
            log.info("lock error:{}",e);
        } finally {
            lock.unlock();
        }
//      log.info("user:{},buy:{},price:{},remainPoints:{}", curUser.getUserID(), curGood.getId(), curGood.getPrice(), curUser.getRemainingPoints());

    }

    private static void singleUserBuy(List<Good> goodsLib, List<User> usersLib, List<BuyRecord> buyRecordsLib, Random random, int j) {
        /**
         * 大于10 防止循环一直寻找 最后一件商品
         */
        while (usersLib.get(j).getRemainingPoints() > REMAIN_MIN_POINTS) {
            User curUser = usersLib.get(j);
            // 随机选择一个商品进行购买
            Good curGood = goodsLib.get(random.nextInt(GOODS_NUM));
            int buyPrice = curGood.getPrice();
            if (curUser.getRemainingPoints() >= buyPrice) {
                // 购买
                curUser.setRemainingPoints(curUser.getRemainingPoints() - buyPrice);
                curGood.setInStock(curGood.getInStock() - 1);

                // record
                BuyRecord buyRecord = new BuyRecord(new Date(), curGood.getPrice(), curGood.getId());
                buyRecordsLib.add(buyRecord);
                curUser.getTotalNum().add(buyRecord);
            }
        }
    }

    private static void buyProcessSingle(List<Good> goodsLib, List<User> usersLib, List<BuyRecord> buyRecordsLib) {
        Random random = new Random(10);
        for (int i = 0; i < USERS_NUM; i++) {
            singleUserBuy(goodsLib, usersLib, buyRecordsLib, random, i);
        }
    }

    private static void loadGoodsAndUsersInfo(List<Good> goodsLib, List<User> usersLib) {
        Random random = new Random(10);
        for (int i = 0; i < GOODS_NUM; i++) {
            /**
             * 用户1000人
             * 初始积分1000
             * 1000/10 * 1000 = 100 000 //10万次 商品价格随机1~10用户积分花完的情况下最少购买10万次
             * 商品价格 随机1~10
             */
            int price = (random.nextInt(10)) + 1;
            goodsLib.add(i, new Good(i, "商品：" + i + "_" + "价格：" + price, GOODS_RESOURCE_NUM, price));
        }
        for (int i = 0; i < USERS_NUM; i++) {
            usersLib.add(i, new User(i));
        }
    }


}
