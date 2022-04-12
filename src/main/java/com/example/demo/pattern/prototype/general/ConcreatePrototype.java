package com.example.demo.pattern.prototype.general;

import java.util.Objects;

public class ConcreatePrototype implements IPrototype {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcreatePrototype that = (ConcreatePrototype) o;
        return age == that.age &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "ConcreatePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public ConcreatePrototype clone() {
        ConcreatePrototype concreatePrototype = new ConcreatePrototype();
        concreatePrototype.setAge(this.age);
        concreatePrototype.setName(this.name);
        return concreatePrototype;
    }
}
