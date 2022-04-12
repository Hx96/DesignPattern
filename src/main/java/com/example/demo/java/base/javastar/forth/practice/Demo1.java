package com.example.demo.java.base.javastar.forth.practice;

/**
 * @author 80307094
 */
public class Demo1 {
    public static void main(String[] args) {
        Len l1 = new Len(Unit.M, 2);
        Len l2 = new Len(Unit.M, 3);
        System.out.println(l1.compare(l2));
    }
}
