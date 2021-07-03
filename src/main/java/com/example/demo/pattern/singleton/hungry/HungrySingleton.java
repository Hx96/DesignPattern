package com.example.demo.pattern.singleton.hungry;

public class HungrySingleton {
    // 先静态后动态
    // 先上，后下
    // 先熟悉后方法 (类加载)
    private static final  HungrySingleton hungrySingleton = new HungrySingleton();
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    private HungrySingleton(){}
}
