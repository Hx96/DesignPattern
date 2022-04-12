package com.example.demo.java.base.reflection;

public class TestClass {
    User user;

    // 获取反射对象
    // Class
    public static void main(String[] args) {
        // 1 class.forName 包名
        User user = null;
        user.getClass();
        // 2 实例 getClass
        // 3 类名 class
        Class<User> userClass = User.class;
        // 方式四 Type
        Class<Integer> type = Integer.TYPE;

    }
}
