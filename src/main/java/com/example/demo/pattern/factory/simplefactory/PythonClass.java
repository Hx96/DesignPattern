package com.example.demo.pattern.factory.simplefactory;

import javax.swing.*;

public class PythonClass implements ICourse {
    @Override
    public void record() {
        System.out.println("python 开课");
    }
}
