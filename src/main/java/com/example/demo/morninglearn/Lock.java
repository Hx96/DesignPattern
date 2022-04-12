package com.example.demo.morninglearn;

/**
 * @author x
 */
public class Lock {
    // 悲观锁，线程对变量进行修改时，其它线程无法访问这个变量
    // 乐观锁，在执行修改操作时才会加锁，代表对象CAS
    // synchronized 对类对象进行加锁，实现方式monitor 计数器
}
