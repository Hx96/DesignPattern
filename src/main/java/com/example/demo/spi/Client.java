package com.example.demo.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Service Provider Interface
 * @author kyle
 * @date 2024/03/10
 */
public class Client {

    public static void main(String[] args) {
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = s.iterator();
        while (iterator.hasNext()) {
            Search search =  iterator.next();
            search.searchDoc("hello world");
        }
    }

}


