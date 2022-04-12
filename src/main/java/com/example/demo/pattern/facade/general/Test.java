package com.example.demo.pattern.facade.general;

/**
 *
 * 客户类
 *
 * @author 35762
 */
public class Test {
  public static void main(String[] args) {
    Facade facade = new Facade();
    facade.doA();
    facade.doB();
    facade.doC();
  }
}
