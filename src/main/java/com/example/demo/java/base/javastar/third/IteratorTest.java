package com.example.demo.java.base.javastar.third;

import java.util.ArrayList;
import java.util.List;

/**
 * 联系for each 与 stream
 *
 *
 * @author 80307094
 */
public class IteratorTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        list.add("l2mz");
        list.add("z4");
        list.forEach(System.out::println);
        list.forEach((i)->{
            System.out.println();
        });
    }

}

