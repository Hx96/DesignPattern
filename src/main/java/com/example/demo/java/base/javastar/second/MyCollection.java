package com.example.demo.java.base.javastar.second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 80307094
 */
public class MyCollection {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add("ssss");
        list.add(new User(1,"hx"));
        list.add(new User(1,"hx"));
        list.add(new User(1,"hx"));
        list.add(new User(1,"hx"));
        list.add(new User(1,"hx"));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer){
                list.remove(i);
                System.out.println(list.get(i));
            }
        }
        System.out.println("===delete");
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            Object obj = iterator.next();
//            if(obj instanceof Integer){
//                System.out.println("delete " + obj.toString());
//                iterator.remove();
//            }
//        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
