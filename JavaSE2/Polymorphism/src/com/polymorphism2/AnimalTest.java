package com.polymorphism2;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("汤姆");
        a.setAge(5);
        System.out.println(a.getName() + "," +a.getAge());
        a.eat();

        a = new Cat("汤姆1", 8);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        Cat c = (Cat)a;
        c.play();

        Animal b = new Dog();
        b.eat();

        Dog d = (Dog)b;
        d.play();
    }
}
