package basic_grammar;

/*
    数据输入：
        Scanner使用的基本步骤：
            1、导包
                import java.util.Scanner;
                导包的动作必须出现在类定义的上边
            2、创建对象
                Scanner sc = new Scanner(System.in);
                上面这个格式里面，只有sc是变量名可以变，其他的都不允许变
            3、接收数据
                int i = sc.nextInt();
                上面这个格式里面，只有i是变量名可以变，其他的都不允许变
 */
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);

        // 接收数据
        int i = sc.nextInt();

        // 输出数据
        System.out.println("i: " + i);
    }
}
