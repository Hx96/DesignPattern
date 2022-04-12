package com.example.demo.pattern.state;

public class BookState implements State{
    @Override
    public void handle() {
        System.out.println("房间已预订");
    }
}
