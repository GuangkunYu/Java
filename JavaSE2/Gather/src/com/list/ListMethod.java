package com.list;

/*
    List集合特有方法：
        add(int index, E element)   在此集合中的指定位置插入指定的元素
        remove(int index)           删除指定索引处的元素，返回被删除的元素
        set(int index, E element)   修改指定索引处的元素，返回被修改的元素
        get(int index)              返回指定索引处的元素
 */

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        list.add(1, "javaee");

//        list.remove(1);

//        list.set(1,"javaee");

//        System.out.println(list.get(1));;

        for (int i=0; i<list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println(list);
    }
}
