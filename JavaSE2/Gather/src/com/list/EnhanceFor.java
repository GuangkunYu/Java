package com.list;

/*
    增强for循环
        增强for：
            简化数组和Collection集合的遍历
        - 实现Iterable接口的类允许其对象成为增强型for语句的目标
        - 是JDK5之后出现的，其内部原理是一个Iterator迭代器

        格式：
            for(元素数据类型 变量名: 数组或者Collection集合){
                // 在此处使用变量即可，该变量就是元素
            }
        范例：
            int[] arr = {1, 2, 3, 4, 5};
            for(int i:arr){
                sout(i);
            }

 */

import java.util.ArrayList;
import java.util.List;

public class EnhanceFor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i: arr){
            System.out.println(i);
        }
        System.out.println("--------------");

        String[] strArray = {"hello", "world", "java"};
        for (String s: strArray){
            System.out.println(s);
        }
        System.out.println("--------------");

        List<String> list = new ArrayList<>();
        list.add("python");
        list.add("django");
        list.add("flask");

        for (String s: list){
            System.out.println(s);
        }
    }
}
