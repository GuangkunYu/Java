package com.set;

/*
    Set集合：
        特点：
            不包含重复元素的集合
            没有带索引的方法，不能使用普通for循环遍历
        HashSet:对集合的迭代顺序不作任何保证

    Set集合练习：
        存储字符串并遍历
 */

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("hello");
        set.add("world");
        set.add("java");

        set.add("world");

        for (String s: set){
            System.out.println(s);
        }
        System.out.println(set);
    }
}
