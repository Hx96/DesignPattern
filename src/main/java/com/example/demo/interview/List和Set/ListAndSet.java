package com.example.demo.interview.List和Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author XingHuang
 *
 *
 * ---| Itreable      接口 实现该接口可以使用增强for循环
 *                 ---| Collection        描述所有集合共性的接口
 *                     ---| List接口        可以有重复元素的集合
 *                             ---| ArrayList
 *                             ---|  LinkedList
 *                     ---| Set接口        不可以有重复元素的集合
 *
 *
 * List: 有序 按对象进入的顺序保存对象，可重复，允许多个Null元素对象，Iterator提取元素使用get获取指定下标元素(随机访问)
 * Set: 无序，不可重复，智能用iterator接口获取所有元素再逐一遍历
 */
public class ListAndSet {

    /**
     *  HashSet：通过hashCode值来确定元素在内存中的位置。一个hashCode位置上可以存放多个元素。
     *---| Iterable      接口 实现该接口可以使用增强for循环
     *                 ---| Collection        描述所有集合共性的接口
     *                     ---| List接口        可以有重复元素的集合
     *                             ---|  ArrayList
     *                             ---|  LinkedList
     *                     ---| Set接口        不可以有重复元素的集合
     *                             ---| HashSet  线程不安全，存取速度快。底层是以哈希表实现的。
     *                 ---| Map        key value 键值对 Map接口中键和值一一映射. 可以通过键来获取值。
     *
     */
    static void showSet(){
        Set hs = new HashSet();
        hs.add("明天");
        hs.add("周一");
        hs.add("周五");
        hs.add(null);
        System.out.println(hs);
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("test");
    }


    /**
     *
     * 相同添加不进去
     */
    static void addFailedEx(){
        Set hs = new HashSet();
        hs.add("明天");
        hs.add("周一");
        hs.add("周五");
        System.out.println(hs.add("周五"));
        System.out.println(hs);
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("test");
    }

    public static void main(String[] args) {
        showSet();
    }
}
