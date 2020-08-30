package com.localinnerclass;

/*
    局部内部类：
        局部内部类是在方法中定义的类，所以外界无法直接使用，需要在方法内部创建对象并使用，
        该类可以直接访问外部类的成员，也可以访问方法内的局部变量
 */

public class Outer {

    private int age = 10;


    public void method() {
        class Inner {
            public void show() {
                System.out.println(age);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
