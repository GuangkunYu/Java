package com.set.test;

/*
    案例：不重复的随机数
    需求：
        编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，
        并在控制台输出
 */


import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class NopeatNumTest {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();

        Random r = new Random();

        while (hashSet.size() < 10) {
            int i = r.nextInt(20)+1;
            hashSet.add(i);
        }

        System.out.println(hashSet);
    }
}
