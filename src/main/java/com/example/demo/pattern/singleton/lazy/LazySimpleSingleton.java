package com.example.demo.pattern.singleton.lazy;

public class LazySimpleSingleton {
    public static synchronized LazySimpleSingleton getInstance(){
        if(instance == null){
            //if(instance == null){
                instance = new LazySimpleSingleton();
           // }
        }
        return instance;
    }
    private static LazySimpleSingleton instance = null;
    private LazySimpleSingleton(){};
}
