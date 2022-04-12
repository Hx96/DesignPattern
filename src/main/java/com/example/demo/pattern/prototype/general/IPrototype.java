package com.example.demo.pattern.prototype.general;

/**
 * 原型模式 指原型实例指定创造对象的种类
 * 不通过new方法，而是通过一个方法去创建对象
 *
 * 调用者不需要知道任何创建的细节，不调用构造函数
 *
 * 属于创建型模式
 *
 *
 * 使用场景
 *
 * 类初始化消耗资源较多
 *
 * new 产生一个对象需要非常繁琐的过程
 *
 * 构造函数比较复杂
 *
 * 循环体中产生大量对象时
 * @author XingHuang
 */
public interface IPrototype<T> {
    /**
     * 复制实体类
     * @return
     */
    T clone();
}
