package com.example.demo.juc.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread tA = new MyThread("Thread-A", task);
        MyThread tB = new MyThread("Thread-B", task);
        MyThread tC = new MyThread("Thread-C", task);
        tA.start();
        tB.start();
        tC.start();
    }
    static class MyThread extends Thread {
        private Task task;
        public MyThread(String name, Task task) {
            super(name);
            this.task = task;
        }
        @Override
        public void run() {
            task.execute();
        }
    }
    static class Task {
        private ReentrantLock lock = new ReentrantLock();
        public void execute() {

            try {
                if (!lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    return;
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println(lock.toString());
                    // 查询当前线程 hold 住此锁的次数
                    System.out.println("\t holdCount: " + lock.getHoldCount());
                    // 查询正等待获取此锁的线程数
                    System.out.println("\t queuedLength: " + lock.getQueueLength());
                    // 是否为公平锁
                    System.out.println("\t isFair: " + lock.isFair());
                    // 是否被锁住
                    System.out.println("\t isLocked: " + lock.isLocked());
                    // 是否被当前线程持有锁
                    System.out.println("\t isHeldByCurrentThread: " + lock.isHeldByCurrentThread());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(Thread.currentThread().getName() + "被中断");
                        e.printStackTrace();
                        throw e;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}