package com.example.demo.java.base.javastar.second.myinterface;

/**
 * 泛型 用来限定传入的类型 也可以不限定
 *
 *
 * @param <T>
 */
interface MyInterface<T>{
  T get(T val);

}

class MyExtend<V,T> implements MyInterface<T>{

  public V getV(V val){
    return val;
  }

  @Override
  public T get(T val) {
    return val;
  }

}

interface MyTest{

}

class Father<T>{
  T get(T val){
    return val;
  }
}


public class Demo {
  public static void main(String[] args) {
//    demo1();
    MyExtend objectObjectMyExtend = new MyExtend();
    System.out.println(objectObjectMyExtend.get("ssadad"));
  }

  private static void demo1() {
    Father<String> father = new Father();
    System.out.println(father.get("dssad"));
    System.out.println(father.get("sdsdd"));
  }
}
