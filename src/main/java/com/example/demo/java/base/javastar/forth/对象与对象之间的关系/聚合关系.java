package com.example.demo.java.base.javastar.forth.对象与对象之间的关系;

public class 聚合关系 {
}


class Computer{
  MainBoard mainBoard;
  DisplayCard displayCard;
}

class MainBoard{
  void control(){

  }
}

class DisplayCard{
  void display(){

  }
}
