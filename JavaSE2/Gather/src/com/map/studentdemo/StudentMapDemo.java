package com.map.studentdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<>();

        Student s1 = new Student("张三", 15);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 35);

        hashMap.put("1110", s1);
        hashMap.put("1111", s2);
        hashMap.put("1112", s3);

//        System.out.println(hashMap);
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        for (Map.Entry<String, Student> me : entries) {
            System.out.println(me.getKey() + "," + me.getValue().getName() + "," + me.getValue().getAge());
        }
    }
}
