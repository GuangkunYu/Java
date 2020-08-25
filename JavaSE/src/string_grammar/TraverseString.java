package string_grammar;

/*
    需求：
        键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 */

import java.util.Scanner;

public class TraverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();

        traverse(s);

    }

    private static void traverse(String s) {
        for (int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}
