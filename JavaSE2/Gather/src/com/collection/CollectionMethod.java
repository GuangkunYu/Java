package com.collection;

/*
    Collection集合常用方法：
        add(E e)                添加元素
        remove(Object o)        从集合中移除指定的元素
        clear()                 清空集合中的元素
        contains(Object o)      判断集合中是否存在指定的元素
        isEmpty()               判断集合是否为空
        size()                  集合的长度，也就是集合中元素的个数

    ALT+7：打开一个窗口，能够看到类的所有信息
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

//        c.remove("world");
//        c.remove("javaee");

//        c.clear();

//        System.out.println(c.contains("world"));
//        System.out.println(c.contains("javaee"));

//        System.out.println(c.isEmpty());

        System.out.println(c.size());

        System.out.println(c);
    }
}
