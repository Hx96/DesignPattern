package com.example.demo.java.base.javastar.fifth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 80307094
 */
public class Lamuda {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a", "b", "c", "d");

        List<String> collect =list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
        //[A, B, C, D]

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1);
        //[2, 4, 6, 8, 10]
    }
}
