package com.example.demo.pattern.proxy;

public class UserServiceProxy extends UserService{
    private UserService userServiceProxy;

    public UserServiceProxy(UserService userServiceProxy) {
        this.userServiceProxy = userServiceProxy;
    }

    @Override
    public void doSomeThing() {
        userServiceProxy.doSomeThing();
        System.out.println("after");
    }
}
