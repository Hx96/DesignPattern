package com.example.demo.java.base.javastar.forth.practice;

/**
 * @author 80307094
 */
public class Len {
    /**
     * 单位 cm mm m
     */
    private Unit unit;

    private int length;

    public boolean compare(Len com) {
        if (!this.unit.getName().equals(com.getUnit().getName())) {
            throw new RuntimeException();
        }
        System.out.println(this.getLength() + this.getUnit().getName() + " is Bigger than " + com.getLength() + com.getUnit().getName());
        return this.length > com.length;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Len(Unit unit, int length) {
        this.unit = unit;
        this.length = length;
    }

}
