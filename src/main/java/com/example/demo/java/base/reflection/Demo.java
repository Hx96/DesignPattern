package com.example.demo.java.base.reflection;

import com.example.demo.java.base.reflection.entity.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class c1 = Class.forName
 *
 * c1.getName();   //包名加类名
 *
 * c1.getSimpleName();
 *
 * c1.getFields(); // 获取类的属性 public属性
 *
 * c1.getDeclaredFields(); //找到全部属性
 *
 * c1.getField(); // 获取值
 *
 * c1.getDeclaredName();
 *
 * getMethods(); // 包括父类的所有方法
 *
 * getDeclaredMethods(); //本类的所有方法
 *
 * getMethod(); //获取方法
 *
 * c1.getConstructor();  public
 *
 * c1.getDeclaredConstructor(); 全部方法
 *
 * getConstructor
 * @author 黄星80307094
 * @date 2021/8/28 14:04
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Class<?> userClass = Class.forName("com.example.demo.java.base.reflection.entity.User");
        // 包名类名
        System.out.println(userClass.getName());
        System.out.println(userClass.getSimpleName());

        // 属性名
        getField(userClass);

        // 方法名
        getMethod(userClass);

        // 构造方法名
        getConstructor(userClass);

    }

    private static void getConstructor(Class<?> userClass) {
        // public
        Constructor<?>[] constructors = userClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // private + public
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    private static void getMethod(Class<?> userClass) throws NoSuchMethodException {
        System.out.println("Method --------------");
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("Declared Method --------------");
        Method[] declaredMethods = userClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("specify Declared Method --------------");
        System.out.println(userClass.getDeclaredMethod("setId", int.class));
    }

    private static void getField(Class<?> userClass) throws NoSuchFieldException {
        System.out.println("Field --------------");

        // 获取 公有属性
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获取 所有属性
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        // 获取属性
        System.out.println(userClass.getDeclaredField("name"));

    }
}
