package com.set;

/*
    HashSet集合：
        特点：
            底层数据结构是哈希表
            对集合的迭代顺序不作任何保证，也就是说不保证存储和取出的元素顺序一致
            没有带索引的方法，所以不能使用普通for循环遍历
            由于是Set集合，所以是不包含重复元素的集合

        HashSet集合添加一个元素的过程：
            调用对象的hashCode()方法获取对象的哈希值

            根据对象的哈希值计算对象的存储位置

            该位置是否有元素存在

            有                                           没有

            遍历该位置的所有元素，和新存入的元素比较哈希值
            是否相同                    都不相同  ------> 将元素存储到该位置
                                                            ^
            有相同的                                         |
                                                            |
            调用equals()方法比较对象内容是否相等            返回false

            返回true

            说明元素重复，不存储


       HashSet集合存储元素：
            要保证元素唯一性，需要重写hashCode()和equals()

    HashSet集合练习：
        存储字符串并遍历
 */

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("java");

        hashSet.add("world");

        for (String s:hashSet){
            System.out.println(s);
        }
    }
}
