package basic_grammar;

/*
    需求：
        一个庙里有3个和尚，他们的身高必须测量得出，用程序获取三个和尚的最高身高
 */

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 接收键盘输入的数据
        System.out.println("请输入3个身高：");
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();

        // 三元运算符判断最大值
        int temp = (height1 > height2) ? height1: height2;
        int maxHeight = (temp > height3) ? temp: height3;

        // 输出最高身高
        System.out.println("最高身高：" + maxHeight);
    }
}
