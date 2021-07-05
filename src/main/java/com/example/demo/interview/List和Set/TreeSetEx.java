package com.example.demo.interview.List和Set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * 现在有一批数据，要求不能重复存储元素，而且要排序。ArrayList 、 LinkedList不能去除重复数据。HashSet可以去除重复，但是是无序。
 * 所以这时候就要使用TreeSet了
 *
 *
 * HashSet：通过hashCode值来确定元素在内存中的位置。一个hashCode位置上可以存放多个元素。
 *      *---| Iterable      接口 实现该接口可以使用增强for循环
 *      *                 ---| Collection        描述所有集合共性的接口
 *      *                     ---| List接口        可以有重复元素的集合
 *      *                             ---|  ArrayList
 *      *                             ---|  LinkedList
 *      *                     ---| Set接口        不可以有重复元素的集合
 *      *                             ---| HashSet  值可以为null线程不安全，存取速度快。底层是以哈希表实现的。
 *      *                             ---| TreeSet  红-黑树的数据结构，默认对元素进行自然排序（String）不允许放入null值。底层是以二叉树实现的。
 *
 * @author XingHuang
 */
public class TreeSetEx {

    /**
     * TreeSet 排序
     *
     */
    static void showSort(){
        TreeSet ts = new TreeSet();
        ts.add("ccc");
        ts.add("aaa");
        ts.add("ddd");
        ts.add("bbb");
        // 报异常 ts.add(null);
        System.out.println(ts);
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        showSort();
    }
}
