package com.example.demo.pattern.state;

public class Client {
    public static void main(String[] args) {
        HomeContext homeContext = new HomeContext();
        homeContext.setState(new FreeState());
        homeContext.setState(new CheckedInState());
        homeContext.setState(new FreeState());

    }
}
