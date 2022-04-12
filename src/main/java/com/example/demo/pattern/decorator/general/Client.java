package com.example.demo.pattern.decorator.general;

/**
 * @author 35762
 */
public class Client {
  public static void main(String[] args) {
    Component concreateComponent = new ConcreateComponent();
    concreateComponent.service();
    System.out.println("----");
    concreateComponent = new ConcreateDecoratorA(concreateComponent);
    concreateComponent.service();
    System.out.println("----");
    concreateComponent = new ConcreateDecoratorB(concreateComponent);
    System.out.println("----");
    concreateComponent.service();
    concreateComponent = new ConcreateDecoratorB(concreateComponent);
    System.out.println("----");
    concreateComponent.service();
  }
}
