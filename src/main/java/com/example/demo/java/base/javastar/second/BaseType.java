package com.example.demo.java.base.javastar.second;

/**
 * 数据类型
 *
 * 8种基本数据类型
 *
 * byte short int long float double char boolean
 *
 *
 *
 * 引用数据类型
 * new
 *
 * StringBuilder
 *
 * StringBuffer
 *
 * 异常
 *
 * 集合 泛型
 *
 * @author 35762
 */
public class BaseType {
  private static int INT;

  public static void main(String[] args) throws Exception {
    demo1();
    demo2();
    throw new MyException();
  }

  /**
   * StringBuffer 与 StringBuilder
   */
  private static void demo2() {
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < INT; i++) {
        stringBuffer.append(i);
    }
    System.out.println(stringBuffer);
  }

  /**
   * 溢出
   */
  private static void demo1() {
    int transfer = 128;
    byte b = (byte) transfer;
    System.out.println(b);
    short sh = 100;
    System.out.println(sh);
  }
}
