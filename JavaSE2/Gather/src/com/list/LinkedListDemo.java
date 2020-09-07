package com.list;

/*
    LinkedList集合的特有功能：
        addFirst(E e)   在该列表开头插入指定的元素
        addLast(E e)    将指定的元素追加到此列表的末尾
        getFirst()      返回此列表中的第一个元素
        getLast()       返回此列表中的最后一个元素
        removeFirst()   从此列表中删除并返回第一个元素
        removeLast()    从此列表中删除并返回最后一个元素
 */

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("java");
        linkedList.add("world");

        linkedList.addFirst("javaee");
        System.out.println(linkedList);

        linkedList.addLast("python");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);

        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
