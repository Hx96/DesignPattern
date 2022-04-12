package com.example.demo.pattern.factory.simplefactory;

import org.springframework.context.annotation.Bean;

public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if (null != clazz) {
                return (ICourse) clazz.getDeclaredConstructor().newInstance();
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return  null;
    }
}
