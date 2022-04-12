package com.example.demo.pattern.observer;

public class BinaryObserver extends Observer{
  public BinaryObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  public BinaryObserver() {
  }

  @Override
  public void update() {
    System.out.println("Binary String: "
    + Integer.toBinaryString(subject.getState()));
  }
}
