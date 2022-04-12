package com.example.demo.pattern.facade.shape;



public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;

    public ShapeMaker() {
        rectangle = new Rectangle();
        circle = new Circle();
    }

    public ShapeMaker(Shape rectangle, Shape circle) {
        this.rectangle = rectangle;
        this.circle = circle;
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
