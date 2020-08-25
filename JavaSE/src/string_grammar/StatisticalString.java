package string_grammar;

import java.util.Scanner;

/*
    需求：
        键盘输入一个字符串，统计该字符串中大写字母字符、小写字母字符、数字字符出现的次数（不考虑
        其他字符）
 */
public class StatisticalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        statistical(line);
    }

    private static void statistical(String line) {
        int capital = 0;
        int lower_case = 0;
        int number = 0;

        byte[] b = line.getBytes();
        for (int i=0; i<b.length; i++){
//            System.out.println(b[i]);
            if (b[i]>=48 && b[i]<=57){
                number++;
            }else if (b[i]>=65 && b[i]<=90){
                capital++;
            }else if (b[i]>=97 && b[i]<=122){
                lower_case++;
            }
        }
        System.out.println("大写字母出现"+capital+"次");
        System.out.println("小写字母出现"+lower_case+"次");
        System.out.println("数字出现"+number+"次");
    }
}
