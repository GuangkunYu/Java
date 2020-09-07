package com.list;

/*
    ListIterator：
        列表迭代器
        - 通过List集合的listIterator()方法得到，是List集合特有的迭代器
        - 用于允许程序员沿任一方向遍历列表的列表迭代器，在迭代期间修改
          列表，并获取列表中迭代器的当前位置

        ListIterator中的常用方法：
            next()          返回迭代中的下一个元素
            hasNext()       如果迭代具有更多元素，则返回true
            previous()      返回列表中的上一个元素
            hasPrevious()   如果此列表迭代器在相反方向遍历列表时具有更多元素，则返回true
            add(E e)        将指定的元素插入列表
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()){
//            String next = lit.next();
//            System.out.println(next);
//        }
//        System.out.println("----------------------");
//
//        while (lit.hasPrevious()){
//            String previous = lit.previous();
//            System.out.println(previous);
//        }

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String next = lit.next();
            if (next.equals("world")){
                lit.add("javaee");
            }
        }

        System.out.println(list);

    }
}
