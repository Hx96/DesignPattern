package com.example.demo.pattern.decorator.general;

public class Decorator extends Component {
  Component component;

  public Decorator(Component component) {
    this.component = component;
  }

  @Override
  public void service() {
    component.service();
    
  }
}
