package arraylist_grammar;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        学生的姓名和年龄来自于键盘录入
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudentDemo02 {
    public static void main(String[] args) {
        ArrayList<Student> stu_array = new ArrayList<>();
        int number = 3;
        arrays(stu_array, number);

        for (int i=0; i<stu_array.size();i++){
            System.out.println(stu_array.get(i).getName() + ", " + stu_array.get(i).getAge());
        }


    }

    public static void arrays(ArrayList<Student> stu_array, int num){
        for (int i = 1; i<=num; i++){
            Scanner sc = new Scanner(System.in);
            Student stu = new Student();

            System.out.println("请输入第"+i+"个人的名字：");
            String name = sc.nextLine();
            stu.setName(name);
            System.out.println("请输入第"+i+"个人的年龄：");
            int age = sc.nextInt();
            stu.setAge(age);

            stu_array.add(stu);
        }

    }
}
