package basic_grammar;

/*
    格式：
        if(关系表达式1){
            语句体1；
        }else if(关系表达式2){
            语句体2；
        }
        ...
        else{
            语句体n+1；
        }
    执行流程：
        1、首先计算关系表达式1的值
        2、如果值为true就执行语句体1，如果值为false就计算关系表达式2的值
        3、如果值为true就执行语句体2，如果值为false就计算关系表达式3的值
        4、......
        5、如果没有任何关系表达式为true，就执行语句体n+1
 */

import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
        // 需求：键盘录入一个星期数(1,2,3,...7)，输出对应的星期一，星期二，...星期三
        Scanner sc = new Scanner(System.in);

        // 键盘录入一个数
        System.out.println("请输入一个数（1-7）：");
        int i = sc.nextInt();

        if (i == 1) {
            System.out.println("星期一");
        } else if (i == 2) {
            System.out.println("星期二");
        } else if (i == 3) {
            System.out.println("星期三");
        } else if (i == 4) {
            System.out.println("星期四");
        } else if (i == 5) {
            System.out.println("星期五");
        } else if (i == 6) {
            System.out.println("星期六");
        } else if (i == 7) {
            System.out.println("星期日");
        } else {
            System.out.println("数字输入错误");
        }
    }
}
