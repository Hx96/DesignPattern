package com.example.demo.java.base.List和Set.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * HashSet：通过hashCode值来确定元素在内存中的位置。一个hashCode位置上可以存放多个元素。
 *      *---| Iterable      接口 实现该接口可以使用增强for循环
 *      *                 ---| Collection        描述所有集合共性的接口
 *      *                     ---| List接口        可以有重复元素的集合
 *      *                             ---|  ArrayList
 *      *                             ---|  LinkedList
 *      *                     ---| Set接口        不可以有重复元素的集合
 *      *                             ---| HashSet  线程不安全，存取速度快。底层是以哈希表实现的。
 *      *                 ---| Map        key value 键值对 Map接口中键和值一一映射. 可以通过键来获取值。
 *                            ---| HashMap
 *                            ---| TreeMap TreeMap基于红黑树（Red-Black tree）实现。该映射根据其键的自然顺序进行排序，或者根据创建映射时提供的 Comparator 进行排序，具体取决于使用的构造方法。TreeMap的基本操作 containsKey、get、put 和 remove 的时间复杂度是 log(n) 。另外，TreeMap是非同步的。 它的iterator 方法返回的迭代器是fail-fastl的。
 *
 * @author XingHuang
 * 给定一个键和一个值，你可以将该值存储在一个Map对象. 之后，你可以通过键来访问对应的值。
 * 当访问的值不存在的时候，方法就会抛出一个NoSuchElementException异常.
 * 当对象的类型和Map里元素类型不兼容的时候，就会抛出一个 ClassCastException异常。
 * 当在不允许使用Null对象的Map中使用Null对象，会抛出一个NullPointerException 异常。
 * 当尝试修改一个只读的Map时，会抛出一个UnsupportedOperationException异常。
 *
 */
public class MapAll {

    /**
     * Map基本操作：
     Map 初始化

     Map<String, String> map = new HashMap<String, String>();

     插入元素

     map.put("key1", "value1");

     获取元素

     map.get("key1")

     移除元素

     map.remove("key1");

     清空map

     map.clear();
     *
     *
     *
     */
    static void showMap(){
        HashMap<String, String> sets = new HashMap<>();
        sets.put("username", "value1");
        sets.put("password", "value2");
        sets.put("key3", "value3");
        sets.put("key4", "value4");
        sets.put(null,null);
        // 增强for循环 =========== keySet ===================
        for (String s : sets.keySet()) {
            System.out.println(s + ".." + sets.get(s));
        }
        System.out.println("------------------");
        //================== entrySet ======================
        for (Map.Entry<String, String> m : sets.entrySet()) {
            System.out.println(m.getKey() + ".." + m.getValue());
        }
        // 迭代器 ================ keySet ===================
        Iterator it = sets.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + ".." + sets.get(key));
        }
        //================== entrySet ======================
        Iterator<Map.Entry<String, String>> iterator = sets.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> m = iterator.next();
            System.out.println(m.getKey() + ".." + m.getValue());
        }
    }

    static void showTreeMap(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(001, "机器人");
        treeMap.put(100, "动物");
        treeMap.put(50, "人类");
        treeMap.put(1000, "外星人");
        for(Map.Entry<Integer, String> m : treeMap.entrySet()){
            System.out.println(m.getKey() + ".." + m.getValue());
        }
    }

    public static void main(String[] args) {
        //showMap();
        showTreeMap();
    }
}
