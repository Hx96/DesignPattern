package com.example.demo.java.base.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 反射效率不高
 *
 */
public class BaseFunction {
    public static void main(String[] args) throws ClassNotFoundException {
        // 反射
        Class<?> userClass = Class.forName("com.example.demo.java.base.reflection.User");
        Class<?> userClass1 = Class.forName("com.example.demo.java.base.reflection.User");
        Class<?> userClass2 = User.class;
        System.out.println(userClass.hashCode());
        System.out.println(userClass2.hashCode());


    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class User{
    private int id;
    private String name;
}
