package basic_grammar;

/*
    需求：
        任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并输出在控制台
 */

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 输入一个整数
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();

        // 判断
        if (i % 2 == 0) {
            System.out.println(i + "是整数");
        } else {
            System.out.println(i + "不是整数");
        }

        System.out.println("结束");
    }
}
