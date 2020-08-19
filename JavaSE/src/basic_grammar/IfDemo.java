package basic_grammar;

/*
    格式：
        if(关系表达式){
            语句体；
        }
    执行流程：
        1、首先计算关系表达式的值
        2、值为true-->执行语句体
        3、值为false-->不执行语句体
        4、继续执行后面的语句内容
 */

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("开始-->");

        // 定义两个变量
        int a = 10;
        int b = 10;

        // 需求：判断a和b的值是否相等，如果相等在控制台输出 a等于b
        if (a == b) {
            System.out.println("a等于b");
        }

        // 需求：判断a和c的值是否相等，如果不相等输出 a不等于c
        int c = 20;
        if (a == c) {
            System.out.println("a等于c");
        }

        System.out.println("结束-->");
    }
}
