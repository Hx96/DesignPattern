package com.example.demo.juc;

/**
 * 线程通信问题
 * A B 操作同一个变量 num=0
 *
 */
public class ProducerQ {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }


}

@lombok.Data
class Data {
    private int num = 0;
    public synchronized void increment() throws InterruptedException {
        if (num != 0) {
            // 等待
            this.wait();
        }
        num ++;
        System.out.println(num + "do++" + Thread.currentThread().getName());
        this.notify();
    }

    public synchronized void decrement() throws InterruptedException {
        if (num == 0) {
            //
            this.wait();
        }
        num --;
        System.out.println(num + "do--" + Thread.currentThread().getName());
        this.notify();
    }
}
