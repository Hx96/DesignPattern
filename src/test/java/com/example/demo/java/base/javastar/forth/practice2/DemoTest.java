package com.example.demo.java.base.javastar.forth.practice2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void test_测试长方形() {
        Geometry rectangle = new Rectangle(5,6);
        assertTrue(30 == rectangle.getArea());
    }


    @Test
    void test_测试正方形() {
        Geometry rectangle = new Square(6,6);
        assertTrue(36 == rectangle.getArea());
    }

    @Test
    void test_测试长方形reset() {
        Geometry rectangle = new Rectangle(5,6);
        rectangle.reset(6,7);
        assertTrue(42 == rectangle.getArea());
    }


    @Test
    void test_测试正方形reset() {
        Geometry rectangle = new Square(6,6);
        rectangle.reset(7,7);
        assertTrue(49 == rectangle.getArea());
    }

//    @Test
//    void test_测试正方形异常() {
//        Square rectangle = new Square(5,6);
//        assertTrue(30 == rectangle.getArea());
//    }


}