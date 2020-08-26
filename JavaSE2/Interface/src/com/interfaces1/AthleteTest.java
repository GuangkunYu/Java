package com.interfaces1;

public class AthleteTest {
    public static void main(String[] args) {
        TableTennisPlayer ttp = new TableTennisPlayer();
        ttp.setName("张三");
        ttp.setAge(28);
        System.out.println(ttp.getName() + ", " + ttp.getAge() + "岁");
        ttp.eat();
        ttp.study();
        ttp.speak();
    }
}
