package com.interfaces1;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，和牛奶");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }
}
