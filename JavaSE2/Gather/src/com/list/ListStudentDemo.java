package com.list;

/*
    案例：ArrayList集合存储学生对象用三种方式遍历
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序
        实现在控制台遍历该集合
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ListStudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("张三", 15);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 35);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        // for循环
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            System.out.println(s.getName()+", "+s.getAge());
        }
        System.out.println("-------------------");

        // 迭代器
        Iterator<Student> itStu = students.iterator();
        while (itStu.hasNext()){
            Student s = itStu.next();
            System.out.println(s.getName()+", "+s.getAge());
        }
        System.out.println("-------------------");

        // 增强for
        for (Student s:students){
            System.out.println(s.getName()+", "+s.getAge());
        }
    }
}
