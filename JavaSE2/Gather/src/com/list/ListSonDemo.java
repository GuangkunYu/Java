package com.list;

/*
    List集合子类特点：
        List集合常用子类：ArrayList， LinkedList
        - ArrayList: 底层数据结构是数组，查询快，增删慢
        - LinkedList: 底层数据结构是链表，查询慢，增删快

    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSonDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("hello");
        array.add("world");
        array.add("java");

        // 遍历
        for (String s : array){
            System.out.println(s);
        }

        System.out.println("-------------------");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s : linkedList){
            System.out.println(s);
        }
    }
}
