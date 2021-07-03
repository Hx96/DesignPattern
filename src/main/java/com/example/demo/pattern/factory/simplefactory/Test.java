package com.example.demo.pattern.factory.simplefactory;

public class Test {
    public static void main(String[] args) {
        ICourse course = new CourseFactory().create(PythonClass.class);
        course.record();
    }
}
