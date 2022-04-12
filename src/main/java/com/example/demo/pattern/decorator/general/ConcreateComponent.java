package com.example.demo.pattern.decorator.general;

/**
 * @author 35762
 */
public class ConcreateComponent extends Component {
  @Override
  public void service() {
    System.out.println("我是基础业务逻辑");
  }
}
