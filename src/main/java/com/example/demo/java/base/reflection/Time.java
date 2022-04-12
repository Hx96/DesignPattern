package com.example.demo.java.base.reflection;

import com.example.demo.java.base.reflection.entity.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 黄星80307094
 * @date 2021/8/28 14:49
 */
public class Time {

    public static final Long EXECUTE_TIME = 3000000000L;

    public static void getNormalTime() {
        User user = new User();
        long start = System.currentTimeMillis();
        for (Long i = 0L; i < EXECUTE_TIME; i++) {
            user.getName();
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void getReflectionTime() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<User> userClass = User.class;
        User user = userClass.newInstance();
        Method getName = userClass.getDeclaredMethod("getName");
        long start = System.currentTimeMillis();
        for (Long i = 0L; i < EXECUTE_TIME; i++) {
            getName.invoke(user);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void getReflectionAccessTime() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<User> userClass = User.class;
        User user = userClass.newInstance();
        Method getName = userClass.getDeclaredMethod("getName");
        getName.setAccessible(true);
        long start = System.currentTimeMillis();
        for (Long i = 0L; i < EXECUTE_TIME; i++) {
            getName.invoke(user);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        getNormalTime();
        getReflectionTime();
        getReflectionAccessTime();
    }
}
