package com.objectapi;

/*
    Object类：
        Object是类层次结构的根，每个类都可以将Object作为超类。所有类都直接或者间接的继承自该类
        构造方法：
            public Object()

        回想面向对象中，为什么说子类的构造方法默认访问的是父类的无参构造方法？
            因为他们的顶级父类只有无参构造方法


        toString()
            返回对象的字符串表示形式，建议所有子类重写该方法，自动生成
 */

public class ToStringDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);
        System.out.println(s);
//        System.out.println(s.toString());
        System.out.println(s.toString());
    }
}
