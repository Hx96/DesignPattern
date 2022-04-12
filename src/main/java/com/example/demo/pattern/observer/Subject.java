package com.example.demo.pattern.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 主类 用于通知改变的对象
 *
 * @author 35762
 */
public class Subject extends AbstractSubject <Integer> {

  private Integer state;

  public void setState(Integer state){
    this.state = state;
    notifyAllObservers();
  }

  public Integer getState() {
    return state;
  }
}
