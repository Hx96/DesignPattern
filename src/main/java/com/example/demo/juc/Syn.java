package com.example.demo.juc;

import lombok.Data;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronized 关键字 全自动 非公平 代码块
 * lock 需要自己释放锁 手动释放解锁 可以公平 也可以非公平
 * 不释放锁会死锁
 */
public class Syn {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j < 5; j++) {
                    ticket.sale();
                }
            }).start();
        }
    }
}

@Data
class Ticket {
    private int number = 50;

    Lock lock = new ReentrantLock();

    public void sale() {
        lock.lock();
        if (number > 0) {
            number--;
            System.out.println(Thread.currentThread().getName() + "卖出" + "剩余" + number);
        }
        lock.unlock();
    }
}