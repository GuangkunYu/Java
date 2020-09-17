package com.map.arraylisthashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("诸葛亮");
        a1.add("赵云");

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("唐僧");
        a2.add("孙悟空");

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("武松");
        a3.add("鲁智深");

        hashMap.put("三国演义", a1);
        hashMap.put("西游记", a2);
        hashMap.put("水浒传", a3);

//        System.out.println(hashMap);
        Set<String> set = hashMap.keySet();
//        System.out.println(set);

        for (String al : set) {
            System.out.println(al);
            ArrayList<String> strings = hashMap.get(al);
//            System.out.println(strings);
            for (String s : strings) {
                System.out.println(" \t " + s);
            }
        }
    }
}
