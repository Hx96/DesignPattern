package com.example.demo.java.base.reflection;

import com.example.demo.java.base.reflection.entity.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 黄星80307094
 * @date 2021/8/28 14:33
 */
public class DemoInstance {
    public static void main(String[] args) throws Exception {

        Class<?> userClass = Class.forName("com.example.demo.java.base.reflection.entity.User");
        // 创建对象
        User user = (User) userClass.newInstance();
        System.out.println(user);

        // 调用方法 invoke
        Method setName = userClass.getDeclaredMethod("setName", String.class);
        setName.invoke(user,"黄星");

        System.out.println(user);

        // 属性赋值 set
        Field id = userClass.getDeclaredField("id");
        id.setAccessible(true);
        id.set(user, 2);
        System.out.println(user);
    }
}
