package com.set;

/*
    LinkedHashSet集合
        特点：
            哈希表和链表实现的Set接口，具有可预测的迭代次序
            由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
            由哈希表保证元素唯一，也就是说没有重复的元素

    LinkedHashSet集合练习：
        存储字符串并遍历
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> ss = new LinkedHashSet<>();

        ss.add("hello");
        ss.add("world");
        ss.add("java");
        ss.add("world");

        for (String s:ss){
            System.out.println(s);
        }
    }
}
