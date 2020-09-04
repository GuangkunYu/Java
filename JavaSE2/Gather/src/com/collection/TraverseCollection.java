package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    Collection集合的遍历
        Iterator：迭代器，集合的专用遍历方式
            Iterator<E> iterator(): 返回此集合中元素的迭代器，通过集合的iterator()方法得到
            迭代器是通过集合的iterator()方法得到的，所以我们说它是依赖于集合而存在的

        Iterator中常用的方法
            E next(): 返回迭代中的下一个元素
            boolean hasNext(): 如果迭代具有更多元素，则返回true
 */
public class TraverseCollection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        // 添加元素
        c.add("hello");
        c.add("world");
        c.add("java");


        Iterator<String> it = c.iterator();

        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
