package com.set;

/*
    比较器排序Comparator的使用：
        存储学生对象并遍历，创建TreeSet集合使用带参构造方法
        要求：
            按照年龄大小从小到大排序，年龄相同时，按照姓名字母顺序排序

    结论：
        用TreeSet集合存储自定义对象，带构造方法使用的是比较器排序对元素进行排序的
        比较器排序，就是让集合构造方法接收Comparator的实现类对象，重写compare(T o1,T o2)方法
        重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
 */

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Student> stus = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });

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
