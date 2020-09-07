package com.set;

/*
    案例：HashSet集合存储学生对象并遍历
    需求：
        创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在
        控制台遍历该集合
    要求：
        学生对象的成员变量值相同，我们就认为是同一个对象

 */

import java.util.HashSet;

public class HashSetStudent {
    public static void main(String[] args) {
        HashSet<Student> stus = new HashSet<>();

        Student s1 = new Student("张三", 15);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("李四", 25);

        stus.add(s1);
        stus.add(s2);
        stus.add(s3);

        for (Student s: stus){
            System.out.println(s.getName() +", "+ s.getAge());
        }
    }
}
