package com.yash.corejava.overriding.shape;

public class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}
