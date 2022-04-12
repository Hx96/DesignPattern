package com.example.demo.java.base.extend;

import java.io.FileNotFoundException;

public class LittleSon extends Father {

  LittleSon(String mess){
    super(mess+"Little");
  }

  @Override
  void eatFood() throws FileNotFoundException {
    System.out.println("小儿子在吃饭");
  }}
