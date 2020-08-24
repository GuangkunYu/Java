package basic_array_method_test;

/*
    需求：if版
        输入星期数，显示今天的减肥活动
        周一：跑步
        周二：游泳
        周三：慢走
        周四：动感单车
        周五：拳击
        周六：爬山
        周日：好好吃一顿
 */

import java.util.Scanner;

public class LoseWeightIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入星期数（1-7）：");
        int week = sc.nextInt();
        loseWeigthMethod(week);
    }

    public static void loseWeigthMethod(int week) {
        if (week == 1) {
            System.out.println("跑步");
        } else if (week == 2) {
            System.out.println("游泳");
        } else if (week == 3) {
            System.out.println("慢走");
        } else if (week == 4) {
            System.out.println("动感单车");
        } else if (week == 5) {
            System.out.println("拳击");
        } else if (week == 6) {
            System.out.println("爬山");
        } else if (week == 7) {
            System.out.println("好好吃一顿");
        } else {
            System.out.println("数据输入错误");
        }
    }
}
