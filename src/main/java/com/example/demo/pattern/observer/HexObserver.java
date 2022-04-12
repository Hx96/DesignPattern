package com.example.demo.pattern.observer;

public class HexObserver extends Observer{


    public HexObserver(AbstractSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public HexObserver() {
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Long.toHexString((Long) subject.getState()));
    }
}
