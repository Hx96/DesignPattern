package com.example.demo.java.base.classloader;

/**
 * @author 黄星80307094
 * @date 2021/8/28 13:46
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader classLoader1 = Integer.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
