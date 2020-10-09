package com.specialflow.properties;

/*
    Properties：
        是一个Map体系的集合类
        Properties可以保存到流中或从流中加载
 */

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        // 练习：Properties作为Map集合的使用
        Properties prop = new Properties();

        // 存储元素
        prop.put("0001", "张三");
        prop.put("0002", "李四");
        prop.put("0003", "王五");

        // 遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key:keySet){
            Object value = prop.get(key);
            System.out.println(key + ", " + value);
        }
    }
}
