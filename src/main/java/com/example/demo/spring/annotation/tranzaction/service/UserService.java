package com.example.demo.spring.annotation.tranzaction.service;

import com.example.demo.java.base.javastar.first.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;

@Component
public class UserService implements InitializingBean {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    OrderService orderService;

    public User user;
    @PostConstruct
    private void initialUser(){
        user = new User("zs", "m");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("my");
        user.setName("ls");
    }

    public void test(){
        Method[] methods = user.getClass().getMethods();
        for (Method method : methods) {
            method.isAnnotationPresent(Anno.class);
        }
    }
}
