package com.anli;

/*
    需求：
        把文本文件中的数据读取到集合中，并遍历集合。
    要求：
        文件中每一行数据是一个学生对象的成员变量值

 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        // 定义学生类
        // 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("IO\\src\\com\\anli\\student.txt"));

        // 创建ArrayList集合对象
        ArrayList<Student> arrays = new ArrayList<>();

        // 调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line = br.readLine()) != null) {
//            System.out.println(line);
            // 把读到的字符串用split()进行分割，得到一个字符串数组
            String[] spl = line.split(",");
//            System.out.println(spl[0] + spl[1] + spl[2]);
            // 创建学生对象
            Student s = new Student();

            // 把字符串数组中的每一个元素取出来对应的赋值给学生对象的成员变量值
            s.setId(spl[0]);
            s.setName(spl[1]);
            s.setAge(Integer.parseInt(spl[2].replaceAll(" ", "")));
            s.setAddress(spl[3]);

            // 把学生对象添加到集合
            arrays.add(s);
        }

        // 释放资源
        br.close();

        // 遍历集合
        for (Student s : arrays) {
            System.out.println(s.getId() + ", " + s.getName() + ", " + s.getAge() + ", " + s.getAddress());
        }
    }
}
