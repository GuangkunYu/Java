package com.specialflow.properties;

/*
    案例：游戏次数
    需求：
        请写程序实现猜数字小游戏只能试玩3次，如果还想玩，提示：游戏试玩结束，想玩请充值

 */

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        // 要完成猜数字的游戏，首先需要有一个要猜的数字，使用随机数生成数字，范围1-100
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true){
            // 使用程序实现猜数字，每次均要输入猜测的数字值，需要使用键盘录入实现
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();

            // 比较输入的数字和系统产生的数据，需要使用分支语句
            if (guessNumber > number){
                System.out.println("你猜的数字 " + guessNumber + "大了");
            }else if (guessNumber < number){
                System.out.println("你猜的数字 " + guessNumber + "小了");
            }else{
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}
