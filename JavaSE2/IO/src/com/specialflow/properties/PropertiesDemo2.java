package com.specialflow.properties;

/*
    Properties作为集合的特有方法：
        Object setProperty(String key, String value):
            设置集合的键和值，都是String类型，底层调用Hashtable方法put

        String getProperty(String key):
            使用此属性列表中指定的键搜索属性

        Set<String> stringPropertyNames():
            从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
 */

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) {
        // 创建集合对象
        Properties prop = new Properties();

        // Object setProperty(String key, String value):设置集合的键和值，都是String类型，底层调用Hashtable方法put
        prop.setProperty("0001", "张三");
        prop.setProperty("0002", "李四");
        prop.setProperty("0003", "王五");

        // String getProperty(String key):使用此属性列表中指定的键搜索属性
//        System.out.println(prop.getProperty("0002"));
//        System.out.println(prop);


        // Set<String> stringPropertyNames():从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        Set<String> names = prop.stringPropertyNames();
        for (String key: names){
//            System.out.println(key);
            String value = prop.getProperty(key);
            System.out.println(key + ", " + value);
        }
    }
}
