package com.example.demo.pattern.observer;

/**
 * 抽象被观察者
 * @author 35762
 */
public abstract class Observer {
  protected AbstractSubject subject;
  public abstract void update();
}
