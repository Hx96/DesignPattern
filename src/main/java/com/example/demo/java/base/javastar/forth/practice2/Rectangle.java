package com.example.demo.java.base.javastar.forth.practice2;

/**
 * @author 80307094
 */
public class Rectangle implements Geometry{
    private int height;
    private int length;
    private int area;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", length=" + length +
                ", area=" + area +
                '}';
    }

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
        this.area = height * length;
    }

    @Override
    public void reset(int height, int length) {
        this.area = height*length;
    }

}
