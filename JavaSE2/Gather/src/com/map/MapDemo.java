package com.map;

/*
    Map集合：
        Interface Map<K, V>     K：键的类型，V：值的类型
        将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
        举例：
            1234567     张三
            1234546     李四
            2345788     王五

    创建Map集合的对象：
        多态的方式
        具体的实现类HashMap
 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("123456", "张三");
        map.put("123457", "李四");
        map.put("123458", "王五");
        map.put("123458", "赵六");

        System.out.println(map);
    }
}
