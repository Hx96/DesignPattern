package com.example.demo.test;

/**
 * @author 黄星80307094
 * @date 2021/8/19 8:51
 */
public class Test {
    public static void main(String[] args) {
        String key = "    sad 实打实大所多         测试 为          达到";
        String res[] = key.trim().split("\\s+");
        System.out.println(res.toString());
    }
}
