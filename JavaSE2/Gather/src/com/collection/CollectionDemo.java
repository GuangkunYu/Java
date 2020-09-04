package com.collection;

/*
    Collection:
        集合类的特点：
            提供一种存储空间可变的存储模型，存储的数据容量可以随时发生改变

        集合类体系结构
                                              集合
                              -----------------|----------------
                              |                                 |
                          Collection  单列                     Map 双列
                  ------------|------------               ------|-----
                  |                       |               |          |
                List 可重复               Set 不可重复   HashMap      ...
            ------|------           ------|------
            |           |           |           |
        ArrayList   LinkedList    HashSet   TreeSet

    Collection集合：
        是单例集合的顶层接口，它表示一组对象，这些对象也称为Collection的元素
        JDK不提供此接口的任何直接实现，它提供更具体的子接口（如Set和List）实现

    创建Collection集合的对象：
        多态的方式
        具体的实现类ArrayList

 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        // 添加数据
        c.add("hello");
        c.add("world");
        c.add("java");

        System.out.println(c);
    }
}
