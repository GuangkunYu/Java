package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsStudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();

        Student s1 = new Student("zhangsan", 15);
        Student s2 = new Student("lisi", 25);
        Student s3 = new Student("wangwu", 35);
        Student s4 = new Student("zhaoliu", 25);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        for (Student s:arrayList){
            System.out.println(s.getName()+", "+s.getAge());
        }
    }
}
