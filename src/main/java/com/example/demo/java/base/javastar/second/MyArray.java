package com.example.demo.java.base.javastar.second;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 80307094
 */
public class MyArray {
    public static void main(String[] args) {
        int[] ints = {1, 3, 4, 5, 2};
        Runnable runnable = () -> {System.out.println("tett");

            System.out.println("chifan");};
        runnable.run();

        List list = new ArrayList<>();
        list.add(ints);
        list.add(1);
        list.forEach(n -> System.out.println(n));

        // Lambda Stream Optional
    }
}
