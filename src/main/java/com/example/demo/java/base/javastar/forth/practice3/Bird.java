package com.example.demo.java.base.javastar.forth.practice3;

/**
 * @author 80307094
 */
public class Bird implements FlyAnimal{
    public int getBirdFlyCount() {
        return birdFlyCount;
    }

    public void setBirdFlyCount(int birdFlyCount) {
        this.birdFlyCount = birdFlyCount;
    }

    private int birdFlyCount;
    @Override
    public void fly() {
        System.out.println("bird fly");
        birdFlyCount++;
        System.out.println(birdFlyCount);
    }
}
