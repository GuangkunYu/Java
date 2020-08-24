package method_grammar;

/*
    形参和实参：
        形参：
            方法定义中的参数
            等同于变量定义格式
        实参：
            方法调用中的参数
            等同于使用变量或常量
 */

import java.util.Scanner;

public class MethodParamTest {
    public static void main(String[] args) {
        // 需求：设计一个方法用于打印两个数中的较大值，数据来自于方法参数
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int one = sc.nextInt();

        System.out.println("请输入第二个数：");
        int two = sc.nextInt();

        getMax(one, two);
    }

    // 定义获取较大值的方法
    public static void getMax(int a, int b) {
        int max = a > b ? a : b;
        System.out.println("较大值是：" + max);
    }
}
