package com.example.demo.spring.annotation.tranzaction.dao;

import org.springframework.stereotype.Repository;

interface test{
    public static final  int a = 0;
    //接口成员变量只能是 public static final

}


@Repository
public class UserDao {
    public void insert()
    {

    }
}
