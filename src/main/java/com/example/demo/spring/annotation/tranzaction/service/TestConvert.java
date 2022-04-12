package com.example.demo.spring.annotation.tranzaction.service;

public class TestConvert implements MyInterface {
    public int a;

    @Override
    public void Before() {
        a = 5;
        System.out.println("tttttttttt");
    }
}
