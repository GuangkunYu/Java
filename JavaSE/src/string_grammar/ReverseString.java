package string_grammar;

/*
    需求：
        定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法，
        在控制台输出结果。例如，键盘录入abc，输出结果cba
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String st = sc.nextLine();

        String s = reverse(st);
        System.out.println(s);
    }

    private static String reverse(String st) {
        String s = "";
        for (int i=st.length()-1; i>=0; i--){
            s += st.charAt(i);
        }
        return s;
    }
}
