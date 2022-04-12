package com.example.demo.java.base.javastar.forth.practice;

/**
 * @author 80307094
 */

public enum Unit {
    M("米", 1), CM("厘米", 2), MM("毫米", 3);

    private String name;
    private int index;

    private Unit(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (Unit c : Unit.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
