package com.example.demo.pattern.observer;

public class Client {
  public static void main(String[] args) {
    subjectDemo();
    LongSubject longSubject = new LongSubject();

    new HexObserver(longSubject);

    System.out.println("first:1511");
    longSubject.setState(1511L);

    System.out.println("second:1512");
    longSubject.setState(1512L);
  }

  private static void subjectDemo() {
    Subject subject = new Subject();

    new BinaryObserver(subject);

    System.out.println("first:15");
    subject.setState(15);

    System.out.println("second:10");
    subject.setState(10);
  }
}
