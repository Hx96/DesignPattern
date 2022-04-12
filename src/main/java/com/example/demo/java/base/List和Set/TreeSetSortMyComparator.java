package com.example.demo.java.base.List和Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 写自己的比较器
 * @author XingHuang
 */
public class TreeSetSortMyComparator {

    static void showPara(){
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add(new Book("think in java", 100));
        ts.add(new Book("java 核心技术", 75));
        ts.add(new Book("现代操作系统", 50));
        ts.add(new Book("java就业教程", 35));
        ts.add(new Book("think in java", 100));
        ts.add(new Book("ccc in java", 100));
        System.out.println(ts);
    }

    public static void main(String[] args) {
        showPara();
    }
}
class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        System.out.println(b1+" comparator "+b2);
        if (b1.getPrice() > b2.getPrice()) {
            return 1;
        }
        if (b1.getPrice() < b2.getPrice()) {
            return -1;
        }
        return b1.getName().compareTo(b2.getName());
    }
}