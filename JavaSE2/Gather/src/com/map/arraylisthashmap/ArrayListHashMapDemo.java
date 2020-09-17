package com.map.arraylisthashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayListHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> al = new ArrayList();

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");

        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");

        al.add(hm1);
        al.add(hm2);
        al.add(hm3);

        for (HashMap<String, String> hm: al){
//            System.out.println(hm);
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for (Map.Entry<String, String> me:entries){
//                System.out.println(me);
                String key = me.getKey();
                String value = me.getValue();
                System.out.println(key + ", " + value);
            }
        }
    }
}
