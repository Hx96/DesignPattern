package com.example.demo.java.base.javastar.second.myinterface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * test
 * @author 35762
 */
public class MyFloat {
  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(simpleDateFormat.format(date));

    // java 8 写法
    LocalDate today = LocalDate.now();

    System.out.println(today);

  }
}
