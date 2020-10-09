package com.anli;

/*
    需求：
        键盘录入5个学生信息（姓名，语文成绩，数学成绩，英语成绩）。
    要求：
        按照成绩总分从高到低写入文本文件
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        // 定义学生成绩类
        // 创建TreeSet集合，通过比较器排序进行排序
        TreeSet<Score> ts = new TreeSet<>(new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2) {
                // 成绩总分高低
                int num = s2.getSum() - s1.getSum();
                // 次要条件
                int num2 = (num == 0) ? s1.getChinese() - s2.getChinese() : num;
                int num3 = (num2 == 0) ? s1.getMath() - s2.getMath() : num2;
                int num4 = (num3 == 0) ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });

        // 键盘录入5个学生数据
        for (int i = 1; i <= 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + i + "个学生的姓名：");
            String name = sc.nextLine();
            System.out.println("请输入第" + i + "个学生的语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("请输入第" + i + "个学生的数学成绩：");
            int math = sc.nextInt();
            System.out.println("请输入第" + i + "个学生的英语成绩：");
            int english = sc.nextInt();

            // 创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            Score s = new Score();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            // 把学生对象添加到TreeSet集合
            ts.add(s);
        }

        // 创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO\\src\\com\\anli\\studentScore.txt"));

        // 遍历集合，得到每一个学生对象
        for (Score s:ts){
            StringBuilder sb = new StringBuilder();

            // 把学生对象的数据拼接成指定格式的字符串
            sb.append(s.getName()).append(", ").append(s.getChinese()).append(", ").append(s.getMath()).append(", ").append(s.getEnglish()).append(", ").append(s.getSum());


            // 调用字符缓冲流对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        bw.close();
    }
}
