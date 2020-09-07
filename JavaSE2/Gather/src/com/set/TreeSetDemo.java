package com.set;

/*
    TreeSet集合：
        特点：
            元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体排序方式取决于构造方法
                TreeSet(): 根据其元素的自然排序进行排序
                TreeSet(Comparator comparator)：根据指定的比较器进行排序
            没有带索引的方法，所以不能使用普通for循环遍历
            由于是Set集合，所以不包含重复元素的集合

    TreeSet集合练习：
        存储整数并遍历
 */

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> in = new TreeSet<>();

        in.add(12);
        in.add(1);
        in.add(120);
        in.add(50);

        for (Integer i:in){
            System.out.println(i);
        }
    }
}
