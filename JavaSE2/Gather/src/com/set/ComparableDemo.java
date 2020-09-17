package com.set;

/*
    自然排序Comparable的使用：
        存储学生对象并遍历，创建TreeSet集合使用无参构造方法
        要求：
            按照年龄大小从小到大排序，年龄相同时，按照姓名字母顺序排序

    结论：
        用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
        自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(To)方法
        重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
 */

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> stus = new TreeSet<>();

        Student s1 = new Student("json", 16);
        Student s2 = new Student("python", 12);
        Student s3 = new Student("c", 22);
        Student s4 = new Student("a", 22);

        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        for (Student s : stus) {
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
