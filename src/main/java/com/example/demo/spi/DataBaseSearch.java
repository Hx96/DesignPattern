package com.example.demo.spi;

import java.util.List;

public class DataBaseSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据库搜索");
        return null;
    }
}
