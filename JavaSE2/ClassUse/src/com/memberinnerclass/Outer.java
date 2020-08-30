package com.memberinnerclass;

public class Outer {

    private int age = 10;

    private class Inner{
        public void show(){
            System.out.println(age);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
