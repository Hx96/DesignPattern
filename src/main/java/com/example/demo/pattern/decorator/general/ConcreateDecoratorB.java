package com.example.demo.pattern.decorator.general;

/**
 * @author 35762
 */
public class ConcreateDecoratorB extends Decorator {
  public ConcreateDecoratorB(Component component) {
    super(component);
  }

  @Override
  public void service() {
    super.service();
    System.out.println("自己的业务逻辑 B");
  }
}
