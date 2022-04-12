package com.example.demo;

import com.example.demo.spring.annotation.tranzaction.service.MyInterface;
import com.example.demo.spring.annotation.tranzaction.service.TestConvert;

import java.util.Date;

public class Certificate {
    public static void main(String[] args) {

        TestConvert testConvert = new TestConvert();
        MyInterface testConvert1 = testConvert;
        testConvert1.Before();
        TestConvert testConvert2 = (TestConvert) testConvert1;
        System.out.println(testConvert2.a);
        Date date = new Date();
        System.out.println(date.toString());
    }
}
