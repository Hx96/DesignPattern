package com.example.demo.pattern.facade.general;

/**
 * 外观角色
 * @author 35762
 */
public class Facade {
  private SubSystemA a = new SubSystemA();
  private SubSystemB b = new SubSystemB();
  private SubSystemC c = new SubSystemC();


  /**
   * 对外接口
   */
  public void doA(){
    this.a.doA();
  }

  /**
   * 对外接口
   */
  public void doB(){
    this.b.doB();
  }

  /**
   * 对外接口1
   */
  public void doC(){
    this.c.doC();
  }

}
