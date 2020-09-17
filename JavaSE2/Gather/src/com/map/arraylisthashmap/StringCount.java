package com.map.arraylisthashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        TreeMap<Character, Integer> hashMap = new TreeMap<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (hashMap.containsKey(c)){
                int value = hashMap.get(c);
                value += 1;
                hashMap.put(c, value);
            }else {
                hashMap.put(c, 1);
            }
        }
//        System.out.println(hashMap);

        Set<Character> key = hashMap.keySet();

        String result = "";
        for (Character c:key){
            Integer value = hashMap.get(c);
//            System.out.println(c);
//            System.out.println(value);
            result = result + c + "("+ value +")";
//            System.out.println(result);
        }
        System.out.println(result);
    }
}
