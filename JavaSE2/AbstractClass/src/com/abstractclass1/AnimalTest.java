package com.abstractclass1;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("汤姆");
        a.setAge(8);
        System.out.println(a.getName()+".,."+a.getAge()+"岁");
        a.eat();

        a = new Cat("杰瑞", 4);
        System.out.println(a.getName()+".,."+a.getAge()+"岁");
        a.eat();
    }
}
