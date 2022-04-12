package com.example.demo.java.base.javastar.forth.practice3;

/**
 * @author 80307094
 */
public class Duck implements FlyAnimal{
    private int duckFlyCount;
    @Override
    public void fly() {
        System.out.println("duck fly");
        duckFlyCount++;
        System.out.println(duckFlyCount);
    }

    public int getDuckFlyCount() {
        return duckFlyCount;
    }

    public void setDuckFlyCount(int duckFlyCount) {
        this.duckFlyCount = duckFlyCount;
    }
}
