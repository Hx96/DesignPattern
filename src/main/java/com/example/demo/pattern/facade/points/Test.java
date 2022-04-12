package com.example.demo.pattern.facade.points;

/**
 * @author 35762
 */
public class Test {
  public static void main(String[] args) {

    GiftInfo spring = new GiftInfo("SPRING");
    FacadeService facadeService = new FacadeService();
    facadeService.sell(spring);

  }
}
