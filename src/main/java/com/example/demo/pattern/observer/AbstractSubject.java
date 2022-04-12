package com.example.demo.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject<T> {
    protected List<Observer> observers
            = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }


    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public abstract void setState(T state);
    public abstract T getState();
}
