package com.example.demo.java.base.javastar.second;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 80307094
 */
public class Demo {
    private static final ThreadLocal<SimpleDateFormat> SDF_HH = ThreadLocal.withInitial(() -> new SimpleDateFormat("HH"));

    public static void main(String[] args) {
//        baseType();
//        MyString();
//        MyTime();
        Integer integer = null;
        System.out.println(integer);
        Integer a = 1;
        // 判断 ? 后表达是否一致,自动拆装箱
        a = a < 0 ? -1: integer;

    }

    private static void MyTime() {
        String[] array = new String[10];
        array[0] = "1";
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        SimpleDateFormat s = SDF_HH.get();
        System.out.println(s.format(new Date()));
    }

    private static void MyString() {
        String str = "hello";
        System.out.println(str.hashCode());
        String str1 = new String("hello");
        System.out.println(str1.hashCode());
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }

    private static void baseType() {
        System.out.println("test");

        // 自动类型提升 byte short char int 自动提升
        char c = 'a';
        System.out.println(2 + c);

        // 如果一个操作数为long，这个表达式都会提升为long
        // int res = 111 + 2L; (标红)

        // 思考
        // a7
        System.out.println("Hello#" + 'a' + 7);
        // 104
        System.out.println(7 + 'a' + "Hello#");

        System.out.println((byte) 128);
    }
}
