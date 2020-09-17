package com.set.test;

/*
    案例：成绩排序
    需求：用TreeSet集合存储多个学生信息（姓名，语文成绩，数学成绩），
        并遍历该集合
    要求：按照总分从高到底出现
 */

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int score1 = o1.getShuScore() + o1.getYuScore();
                int score2 = o2.getShuScore() + o2.getYuScore();
                int num = score2 - score1;
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        Student s1 = new Student("zhangsan", 98, 81);
        Student s2 = new Student("lisi", 95, 86);
        Student s3 = new Student("wangwu", 91, 80);
        Student s4 = new Student("zhaoliu", 90, 90);
        Student s5 = new Student("zhaoliu", 98, 81);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s:ts){
            System.out.println(s.getName() + ", 总分" + (s.getYuScore() + s.getShuScore()));
        }
    }
}
