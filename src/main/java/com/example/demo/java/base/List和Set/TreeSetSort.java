package com.example.demo.java.base.List和Set;

import java.util.TreeSet;

/**
 * 实现Comparable接口，覆盖compareTo方法
 * @author XingHuang
 */
public class TreeSetSort {

    static void showSortPerson(){
        TreeSet ts = new TreeSet();
        ts.add(new Person("aa", 20, "男"));
        ts.add(new Person("bb", 18, "女"));
        ts.add(new Person("cc", 17, "男"));
        ts.add(new Person("dd", 17, "女"));
        ts.add(new Person("dd", 15, "女"));
        ts.add(new Person("dd", 15, "女"));
        System.out.println(ts);
        // 5
        System.out.println(ts.size());
    }

    public static void main(String[] args) {
        showSortPerson();
    }

}
