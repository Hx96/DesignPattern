package com.example.demo.pattern.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 主类 用于通知改变的对象
 *
 * @author 35762
 */
@Data
public class Subject {

  private List<Observer> observers
    = new ArrayList<>();
  private int state;

  public void setState(int state){
    this.state = state;
    notifyAllObservers();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void notifyAllObservers(){
    for (Observer observer : observers) {
      observer.update();
    }
  }

}
