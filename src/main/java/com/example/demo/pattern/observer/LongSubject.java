package com.example.demo.pattern.observer;

public class LongSubject extends AbstractSubject <Long> {
    private Long state;

    @Override
    public void setState(Long state) {
        this.state = state;
        notifyAllObservers();
    }

    @Override
    public Long getState() {
        return state;
    }
}
