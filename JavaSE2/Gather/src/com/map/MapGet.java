package com.map;

/*
    Map集合的获取功能：
        V get(Object key)                   根据键获取值
        Set<K> keySet()                     获取所有键的集合
        Collection<V> values()              获取所有值的集合
        Set<Map.Entry<K, V>> entrySet()     获取所有键值对对象的集合
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapGet {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        
        // V get(Object key)
        System.out.println(map.get("张无忌"));
        
        // Set<K> keySet()
        Set<String> keySet = map.keySet();
        for (String s:keySet){
            System.out.println(s);
        }

        // Collection<V> values()
        Collection<String> values = map.values();
        for (String s:values){
            System.out.println(s);
        }

        // Set<Map.Entry<K, V>> entrySet()
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> m:entries){
            System.out.println(m);
            System.out.println(m.getKey() + ", " + m.getValue());
        }
    }
}
