package com.example.demo.java.base.List和Set;

/**
 * @author XingHuang
 */
public class Book {
    private String name;
    private double price;
    public Book() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book [name=" + name + ", price=" + price + "]";
    }
}
