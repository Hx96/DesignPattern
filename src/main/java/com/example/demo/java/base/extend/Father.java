package com.example.demo.java.base.extend;

import java.io.IOException;

public class Father {
  Father(String mess){
    System.out.println("father" + mess);
  }
  void eatFood() throws IOException {
    System.out.println("爸爸在吃饭");
  }
}
