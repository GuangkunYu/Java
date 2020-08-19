package basic_grammar;

/*
    需求：
        小明快要考试了，爸爸对他说，会根据不同的考试成绩，送他不同的礼物，假如你可以控制小明的得分，用程序实现小明到底该获得
        什么样的礼物，并在控制台输出。
        95~100：自行车一辆
        90~94：游乐场玩一次
        80~89：变形金刚一个
        <80：揍一顿
 */

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入小明的成绩：");
        int grade = sc.nextInt();

        if (grade >= 95 && grade <= 100) {
            System.out.println("小明获得自行车一辆");
        } else if (grade >= 90 && grade <= 94) {
            System.out.println("小明获得游乐场游玩机会一次");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("小明获得变形金刚玩具一个");
        } else if (grade >= 0 && grade < 80) {
            System.out.println("被老爸胖揍一顿");
        } else {
            System.out.println("成绩输入错误");
        }
    }
}

// 数据测试：正确数据，边界数据，错误数据