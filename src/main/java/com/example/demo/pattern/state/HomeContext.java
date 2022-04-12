package com.example.demo.pattern.state;

public class HomeContext {

    public void setState(State state) {
        this.state = state;
        state.handle();
    }

    private State state;
}
