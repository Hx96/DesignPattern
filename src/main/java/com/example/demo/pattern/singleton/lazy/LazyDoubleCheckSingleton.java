package com.example.demo.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {
    public static LazyDoubleCheckSingleton getInstance(){
        // 检查是否阻塞
        if(instance == null){
            synchronized(LazyDoubleCheckSingleton.class)
            {
                //检查是否创建实例
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                    // 指令重排序问题
                }
            }
        }
        return instance;
    }
    private volatile static LazyDoubleCheckSingleton instance = null;
    private LazyDoubleCheckSingleton(){};
}
