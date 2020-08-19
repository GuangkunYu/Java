package basic_grammar;

/*
    需求：
        程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少
            当猜错的时候根据不同情况给出相应的提示：
                如果猜的数字比真实的大，提示你猜的数据大了
                如果猜的数字比真实的小，提示你猜的数据小了
                如果猜的数字与真实相等，提示恭喜你猜中了
 */

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        // 生成一个1-100的随机数
        Random r = new Random();
        int num = r.nextInt(100) + 1;
//        System.out.println(num);

        // 键盘输入猜的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入猜的数字：");


        int i = 0;
        while(i < 5){
            int get = sc.nextInt();
            if (num > get && i<=3){
                System.out.println("猜小了，请再来一次：");
            }else if (num > get && i > 3) {
                System.out.println("猜小了！");
            } else if (num < get && i <= 3) {
                System.out.println("猜大了，请再来一次：");
            }else if (num < get && i > 3){
                System.out.println("猜大了！");
            }else if (num == get){
                System.out.println("恭喜你，猜对了！！！");
                break;
            }
            i++;
            if (i == 5){
                System.out.println("你没次数了，游戏结束");
            }
        }
    }
}
