package com.example.demo.java.base.javastar.forth.对象与对象之间的关系;

import java.util.Set;

/**
 *整体—>部分关系
 *
 *
 *
 *
 */
public class 关联关系 {
  public static void main(String[] args) {
    System.out.println("test");
  }
}


class Person {
  private Integer id;
  private String name;
  private Set<Card> cards;

  public Set<Card> getCards() {
    return cards;
  }

  public void setCards(Set<Card> cards) {
    this.cards = cards;
  }
}

class Card {
  private Integer id;
  private Person person;

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }
}

// 关联关系 一个person 多个 card
