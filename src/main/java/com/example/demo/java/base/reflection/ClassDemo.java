package com.example.demo.java.base.reflection;

public class ClassDemo {
    /**
     * 所有类型的Class
     *
     * @param args
     */
    public static void main(String[] args) {
        Class<Object> objectClass = Object.class;
        Class<Comparable> comparableClass = Comparable.class;
        Class<String[]> aClass = String[].class;
        Class<Class> classClass = Class.class;
    }
}
