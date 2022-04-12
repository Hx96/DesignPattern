package com.example.demo.java.base.extend;

public class BigSon extends Father {
  BigSon(String mess){
    super(mess+"Big");
  }

  @Override
  void eatFood(){
    System.out.println("大儿子在吃饭");
  }
}
