package com.example.demo.pattern.singleton;

import com.example.demo.pattern.singleton.hungry.HungrySingleton;
import com.example.demo.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.example.demo.pattern.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        System.out.println(LazyDoubleCheckSingleton.getInstance().hashCode());
    }
}
