package com.example.demo.pattern.observer;

public class Client {
  public static void main(String[] args) {
    Subject subject = new Subject();

    new BinaryObserver(subject);

    System.out.println("first:15");
    subject.setState(15);

    System.out.println("second:10");
    subject.setState(10);
  }
}
