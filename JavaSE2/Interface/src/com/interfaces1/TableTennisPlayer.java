package com.interfaces1;

public class TableTennisPlayer extends Player implements SpeakEnglish {
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜，和小米粥");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何发球和接球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
