package string_grammar;

/*
    需求：已知用户名和密码，请用程序实现模拟用户登录，总共给三次机会，登录之后，给出相应的提示
 */

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String known_username = "zhangsan";
        String known_password = "123456";
        login(known_username, known_password);
    }

    // 用户登录的方法
    public static void login(String name, String pwd){
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++){

            System.out.println(">>>>>>>");
            System.out.println("请输入用户名：");
            String username = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            System.out.println(">>>>>>>");

            if (username.equals(name) && password.equals(pwd)){
                System.out.println("登录成功！");
                break;
            }else {
                System.out.println("登录失败，你还有" + (3-i-1) +"次机会!");
            }
        }

    }
}
