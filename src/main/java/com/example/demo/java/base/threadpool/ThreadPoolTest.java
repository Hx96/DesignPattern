package com.example.demo.java.base.threadpool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 对线程池进行创建 线程池管理器、工作线程、任务列队、任务接口 1. 线程池管理器的作用是创建、销毁并管理线程池，将工作线程放入线程池中 2. 工作线程是一个可以循环执行任务的线程，在没有任务是进行等待 3.
 * 任务列队的作用是提供一种缓冲机制，将没有处理的任务放在任务列队中 4. 任务接口是每个任务必须实现的接口，主要用来规定任务的入口、任务执行完后的收尾工作、任务的执行状态等 工作线程通过该接口调度任务的执行。
 *
 * 线程池管理器 创建线程池，销毁线程池，添加新任务。
 *
 * 线程同步 lock synchronized
 * 线程等待countdown
 * 线程安全 vector
 *
 * @author Hx
 */
public class ThreadPoolTest {

    /**
     * 开启5个线程打印字符串list
     */
    public static void main(String[] args) {

        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            strList.add("String" + i);
        }

        int threadNum = strList.size() < 5 ? strList.size() : 5;
        // 创建一个执行器，来打印线程
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, threadNum, 300,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < threadNum; i++) {
            // 执行一个继承Runnable线程的接口
            // executor.execute(new PrintStringThread(i, strList, threadNum));
            executor.execute(() -> {
                System.out.println("test!");
            });
        }
        // 销毁线程
        executor.shutdown();

        // 异步任务执行
        try {
            new Thread(() -> {
                try {
                    // 迁移
                    System.out.println("==============异步");
                    System.out.println(1/0);
                } catch (Exception e) {
                    System.out.println(e);
                    //throw new GlobalException(ResultCodeEnum.AUDIT_LOG_TRANSFER_PROCESS_ERROR, e);
                } finally {

                }
                System.out.println(2/0);
            }).start();
        }catch (Exception e){
            System.out.println("抛出" + e);
        }

    }
}

class PrintStringThread implements Runnable {

    private int num;

    private List<String> strList;

    private int threadNum;

    /**
     * 构造函数传递打印的List与线程个数与数量
     * @param num
     * @param strList
     * @param threadNum
     */
    public PrintStringThread(int num, List<String> strList, int threadNum) {
        this.num = num;
        this.strList = strList;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        int length = 0;
        for (String str : strList) {
            System.out.println("线程编号：" + num + "，字符串：" + str);
            if (length % threadNum == num) {
            }
            length++;
        }
    }
}

interface ConstVariable{
    int USER_NAME = 1;
}