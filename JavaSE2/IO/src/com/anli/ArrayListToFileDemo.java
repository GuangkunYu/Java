package com.anli;

/*
    需求：
        把ArrayList集合中的学生数据写入到文本文件
    要求：
        每一个学生对象的数据作为文件中的一行数据
    格式：
        学号，姓名，年龄，居住地
    举例：
        0001, 张三, 20, 北京
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        // 定义学生类
        // 创建ArrayList集合
        ArrayList<Student> arrays = new ArrayList<>();

        // 创建学生对象
        Student s1 = new Student("张三", "0001", "北京", 20);
        Student s2 = new Student("李四", "0002", "上海", 27);
        Student s3 = new Student("王五", "0003", "广州", 25);

        // 把学生对象添加到集合中
        arrays.add(s1);
        arrays.add(s2);
        arrays.add(s3);

        // 创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\src\\com\\anli\\student.txt"));

        // 把学生对象的数据拼接成指定格式的字符串
        for (Student s : arrays){
            String stu = s.getId() + ", " + s.getName() + ", " + s.getAge() + ", " + s.getAddress();
            // 调用字符缓冲流对象的方法写数据
            bw.write(stu);
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        bw.close();
    }
}
