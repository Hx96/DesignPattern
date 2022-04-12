package com.example.demo.java.base.reflection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 黄星80307094
 * @date 2021/8/28 14:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends People{
    private int id;
    private String name;
    private User(int id){
        this.id = id;
    }
}
