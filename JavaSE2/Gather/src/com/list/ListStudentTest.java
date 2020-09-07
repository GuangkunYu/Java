package com.list;

/*
    案例：List集合存储学生对象用三种方式遍历
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在
        控制台遍历该集合
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("张三", 15);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 35);

        students.add(s1);
        students.add(s2);
        students.add(s3);

//        System.out.println(students);
        // 普通for：带有索引的遍历方式
        for (int i = 0; i<students.size(); i++){
            String name = students.get(i).getName();
            int age = students.get(i).getAge();

            System.out.println(name + ", " + age);
        }
        System.out.println("-------------------");

        // 迭代器：集合特有的遍历方式
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            Student st = it.next();
            String name = st.getName();
            int age = st.getAge();
            System.out.println(name + ", " + age);
        }
        System.out.println("--------------------");

        // 增强for：最方便的遍历方式
        for (Student s: students){
            String name = s.getName();
            int age = s.getAge();
            System.out.println(name + ", " + age);
        }
    }
}
