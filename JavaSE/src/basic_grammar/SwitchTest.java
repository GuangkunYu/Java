package basic_grammar;

/*
    需求：
        一年有12个月，分属于春夏秋冬4个季节，键盘录入一个月份，判断该月份属于哪个季节，并输出
        春：3、4、5
        夏：6、7、8
        秋：9、10、11
        冬：12、1、2
 */

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入月份：");
        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println(month + "月份是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + "月份是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + "月份是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month + "月份是冬季");
                break;
            default:
                System.out.println("月份输入错误");
        }
    }
}
