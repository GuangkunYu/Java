package basic_grammar;

/*
    格式：
        if(关系表达式）{
            语句体1;
        }else{
            语句体2;
        }
    执行流程：
        1、首先计算关系表达式的值
        2、如果关系表达式的值为true执行语句体1
        3、如果关系表达式的值为false执行语句体2
        4、继续执行后面的语句内容
 */

public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("开始-->");

        // 定义两个变量
        int a = 10;
        int b = 20;

        // 需求：判断a是否大于b，如果大于，输出a的值大于b；如果不大于,输出a的值不大于b
        if (a > b) {
            System.out.println("a的值大于b");
        } else {
            System.out.println("a的值不大于b");
        }

        System.out.println("结束-->");
    }
}
