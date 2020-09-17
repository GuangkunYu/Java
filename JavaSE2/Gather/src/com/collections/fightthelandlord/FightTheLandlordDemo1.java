package com.collections.fightthelandlord;

/*
    案例：模拟斗地主
    需求：通过程序实现斗地主过程中的洗牌，发牌和看牌
 */

import java.util.ArrayList;
import java.util.Collections;

public class FightTheLandlordDemo1 {
    public static void main(String[] args) {
        // 创建牌盒对象
        ArrayList<String> arrayList = new ArrayList<>();

        // 往牌盒里面装牌
        /*
            ♦2，...，♦A
            ♣2，...，♣A
            ♥2，...，♥A
            ♠2，...，♠A
            大王，小王
         */
        // 定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String color:colors){
            for (String num:numbers){
                arrayList.add(color+num);
            }
        }
        arrayList.add("大王");
        arrayList.add("小王");

//        System.out.println(arrayList);
        // 洗牌
        Collections.shuffle(arrayList);

//        System.out.println(arrayList);

        // 发牌
        ArrayList<String> zs = new ArrayList<>();
        ArrayList<String> ls = new ArrayList<>();
        ArrayList<String> ww = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();

        for (int i = 0; i<arrayList.size();i++){
            String poker = arrayList.get(i);
            if (i>=arrayList.size()-3){
                dp.add(poker);
            }else if (i%3==0){
                zs.add(poker);
            } else if (i % 3 == 1) {
                ls.add(poker);
            } else if (i % 3 == 2) {
                ww.add(poker);
            }
        }

        // 看牌
        lookPoker("张三", zs);
        lookPoker("李四", ls);
        lookPoker("王五", ww);
        lookPoker("底牌", dp);

    }

    public static void lookPoker(String name, ArrayList<String> arrayList){
        System.out.println(name + "的牌是：");
        System.out.print("\t");
        for (String s:arrayList){
            System.out.print(s + "  ");
        }
        System.out.println();
    }
}
