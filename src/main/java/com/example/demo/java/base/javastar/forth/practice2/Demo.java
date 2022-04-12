package com.example.demo.java.base.javastar.forth.practice2;

/**
 * @author 80307094
 */
public class Demo {
    public static void main(String[] args) {
        Geometry geometry = new Square(5,5);
        geometry.reset(6,6);
        System.out.println(geometry.getArea());
        Square s = (Square) geometry;
        System.out.println(s.getLength());
    }
}
