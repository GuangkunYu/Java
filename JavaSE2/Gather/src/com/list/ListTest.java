package com.list;

/*
    案例：
        List集合存储学生对象并遍历
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在
        控制台遍历该集合
 */

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("张三", 15);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 35);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i =0; i<list.size(); i++){
            Student student = list.get(i);
            System.out.println(student.getName() + ", " + student.getAge() + "岁");
        }
    }
}
