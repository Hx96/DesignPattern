package com.example.demo.pattern.proxy;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserService());
        userServiceProxy.doSomeThing();

    }
}
