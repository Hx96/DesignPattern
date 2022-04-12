package com.example.demo.java.base.exceotion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {


  static void TestException() throws IOException {
    FileInputStream fileInputStream = new FileInputStream("");
  }

  public static void main (String[] args) throws FileNotFoundException {
    int dev = 0;

    try {
      System.out.println(1/dev);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("test");
    }
    System.out.println("==============>>>>>>>test");
    FileInputStream fileInputStream = new FileInputStream("");
    // TestException();
  }
}
