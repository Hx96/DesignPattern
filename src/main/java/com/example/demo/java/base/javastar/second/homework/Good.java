package com.example.demo.java.base.javastar.second.homework;

import lombok.AllArgsConstructor;

/**
 * @author 80307094
 */
@AllArgsConstructor
public class Good {

    /**
     * id
     */
    private int id;
    /**
     * 描述
     */
    private String description;
    /**
     * 库存
     */
    private int inStock;
    /**
     * 价格
     */
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", inStock=" + inStock +
                ", price=" + price +
                '}';
    }
}
