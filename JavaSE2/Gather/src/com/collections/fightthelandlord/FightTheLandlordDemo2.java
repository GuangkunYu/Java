package com.collections.fightthelandlord;

/*
    案例：模拟斗地主
    需求：通过程序实现斗地主过程中的洗牌，发牌和看牌
    要求：对牌进行排序
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class FightTheLandlordDemo2 {
    public static void main(String[] args) {
        // 创建牌盒对象HashMap,键是编号，值是牌
        HashMap<Integer, String> hashMap = new HashMap<>();

        // 创建ArrayList存储编号
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // 从0开始往HashMap里存牌
        int index = 0;
        for (String num:numbers){
            for (String col:colors){
                hashMap.put(index, col+num);
                arrayList.add(index);
                index++;
            }
        }
        hashMap.put(index, "小王");
        arrayList.add(index);
        index++;
        hashMap.put(index, "大王");
        arrayList.add(index);

        // 洗牌
        Collections.shuffle(arrayList);

        // 发牌
        TreeSet<Integer> zs = new TreeSet<>();
        TreeSet<Integer> ls = new TreeSet<>();
        TreeSet<Integer> ww = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();

        for (int i=0; i<arrayList.size();i++){
            int x = arrayList.get(i);
            if (i>=arrayList.size()-3){
                dp.add(x);
            } else if (i % 3 == 0) {
                zs.add(x);
            } else if (i % 3 == 1) {
                ls.add(x);
            } else if (i % 3 == 2) {
                ww.add(x);
            }
        }

        // 看牌
        lookPoker("张三", zs, hashMap);
        lookPoker("李四", ls, hashMap);
        lookPoker("王五", ww, hashMap);
        lookPoker("底牌", dp, hashMap);
    }


    // 看牌方法
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm){
        System.out.println(name + "的牌是：");
        System.out.print("\t");
        for (Integer i: ts){
            String poker = hm.get(i);
            System.out.print(poker + "  ");
        }
        System.out.println();
    }
}
