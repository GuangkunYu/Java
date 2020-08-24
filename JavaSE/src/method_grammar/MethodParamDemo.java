package method_grammar;

/*
    带参数方法的定义：
        格式：
            public static void 方法名(参数){... ...}
        格式（单个参数）：
            public static void 方法名(数据类型 变量名){... ...}
        格式（多个参数）：
            public static void 方法名(数据类型 变量名1, 数据类型 变量名2, ...){... ...}

        注意：
            方法定义时，参数中的数据类型和变量名都不能缺少，缺少任意一个程序将报错
            方法定义时，多个参数之间使用逗号分隔

    带参数方法调用：
        格式：
            方法名(参数);
        格式（单个参数）：
            方法名(变量名/常量值);
        格式（多个参数）：
            方法名(变量名1/常量值1， 变量名2/常量值2)；

        注意：
            方法调用时，参数的数量与类型必须与方法定义中的设置相匹配，否则程序将报错
 */

import java.util.Scanner;

public class MethodParamDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据：");
        int num = sc.nextInt();
        isEven(num);
    }

    // 需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
    public static void isEven(int a){
        if(a % 2 ==0){
            System.out.println(a + "是偶数");
        }else {
            System.out.println(a + "不是偶数");
        }
    }
}
