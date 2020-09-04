package com.list;

/*
    需求：
        我有一个集合：List<String> list = new ArrayList<>();
        里面有三个元素：list.add("hello");
                      list.add("world");
                      list.add("java");
        遍历集合，得到每一个元素，看有没有“world”这个元素，如果有，
        我就添加一个“javaee”元素，请写代码实现

    并发修改异常：
        - ConcurrentModificationException

        产生原因：
            迭代器遍历的过程中，通过集合对象修改了集合中元素的长度，造成了
            迭代器获取元素中判断预期修改值和实际修改值不一致

        解决方案：
            用for循环遍历，然后用集合对象做对应的操作即可
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        Iterator<String> it =  list.iterator();

//        while (it.hasNext()){
//            String s = it.next();
//            if (s.equals("world")){
//                list.add("javaee");
//            }
//        }

        for (int i = 0; i<list.size();i++){
            String s = list.get(i);
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}