package com.map.studentdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMapDemo2 {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<>();

        Student s1 = new Student("张三", 15);
        Student s2 = new Student("李四", 25);
        Student s3 = new Student("王五", 35);

        hashMap.put(s1, "北京");
        hashMap.put(s2, "上海");
        hashMap.put(s3, "广州");

        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();

        for (Map.Entry<Student, String> hm : entries) {
            Student key = hm.getKey();
            String value = hm.getValue();
            System.out.println(key.getName() + ", " + key.getAge() + ", " + value);
        }
    }
}
