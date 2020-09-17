package com.collections;

/*
    Collections类：
        是针对集合操作的工具类

    常用方法：
        sout(List<T> list)      将指定的列表按升序排序
        reverse(List<T> list)   反转指定列表中元素的顺序
        shuffle(List<T> list)   使用默认的随机源随机排列指定的列表
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(20);
        li.add(10);
        li.add(50);
        li.add(40);
        li.add(30);

        System.out.println(li);

        // sout(List<T> list)      将指定的列表按升序排序
        Collections.sort(li);
        System.out.println(li);

        // reverse(List<T> list)   反转指定列表中元素的顺序
        Collections.reverse(li);
        System.out.println(li);

        // shuffle(List<T> list)   使用默认的随机源随机排列指定的列表
        Collections.shuffle(li);
        System.out.println(li);
    }
}
