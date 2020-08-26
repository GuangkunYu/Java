package com.polymorphism;

public class Cat extends Animal {
    public int age = 5;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
