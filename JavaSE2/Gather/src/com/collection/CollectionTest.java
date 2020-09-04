package com.collection;

/*
    案例：
        Collection集合存储学生对象并遍历
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        Student s1 = new Student("张三", 15);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 35);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();

        while (it.hasNext()) {
            Student next = it.next();
            System.out.println(next.getName() +
                    next.getAge() + "岁");
        }
    }
}

