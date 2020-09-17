package com.map;

/*
    Map集合的基本功能：
        V put(K key, V value)                   添加元素
        V remove(Object key)                    根据键删除键值对
        void clear()                            移除所有的键值对元素
        boolean containsKey(Object key)         判断集合是否包含指定的键
        boolean containsValue(Object value)     判断集合是否包含指定的值
        boolean isEmpty()                       判断集合是否为空
        int size()                              集合的长度，也就是集合中键值对的个数
 */

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // V put(K key, V value)
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        // V remove(Object key)
//        System.out.println(map.remove("郭靖"));

        // void clear()
//        map.clear();

        // boolean containsKey(Object key)
//        System.out.println(map.containsKey("郭靖"));

        // boolean isEmpty()
//        System.out.println(map.isEmpty());

        // int size()
        System.out.println(map.size());
        System.out.println(map);

    }
}
