package com.example.demo;

import com.example.demo.java.base.reflection.entity.User;
import com.example.demo.spring.annotation.tranzaction.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoApplication.class);
        System.out.println(annotationConfigApplicationContext.getBean("userService", UserService.class));

        UserService bean = annotationConfigApplicationContext.getBean("userService", UserService.class);
        System.out.println(bean.user);
//        SpringApplication.run(DemoApplication.class, args);
    }

}
