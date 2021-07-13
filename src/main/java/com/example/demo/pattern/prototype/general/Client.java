package com.example.demo.pattern.prototype.general;

/**
 * @author XingHuang
 */
public class Client {

    public static void main(String[] args) {
        ConcreatePrototype prototype = new ConcreatePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        System.out.println(prototype);
        // 拷贝原型对象
        ConcreatePrototype cloneType = prototype.clone();
        System.out.println(cloneType);
    }
}
