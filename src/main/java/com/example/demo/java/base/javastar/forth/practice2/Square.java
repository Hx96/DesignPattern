package com.example.demo.java.base.javastar.forth.practice2;

/**
 * @author 80307094
 */
public class Square extends Rectangle {
    public Square(int height, int length) {
        super(height, length);
        if (height != length) {
            throw new RuntimeException();
        }
    }

    @Override
    public void reset(int height, int length) {
        if (height != length) {
            throw new RuntimeException();
        }
        this.setArea(height*length);
    }

}
