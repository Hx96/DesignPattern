package com.example.demo.pattern.prototype.demo;

import java.lang.reflect.Field;

/**
 * @author XingHuang
 */
public class BeanUtils {
    public static Object copy(Object prototype) {
        Class clazz = prototype.getClass();
        Object returnValue = null;
        try {
            returnValue = clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                field.set(returnValue, field.get(prototype));
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
