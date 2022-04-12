package com.example.demo.java.base.javastar.forth.practice3;

/**
 * @author 80307094
 */
public class Client {
    private static final Integer TIME = 100;

    static void fly(FlyAnimal flyAnimal) {
        flyAnimal.fly();
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Duck duck = new Duck();
        for (int i = 0; i < TIME; i++) {
            fly(bird);
            fly(duck);
        }
    }
}
