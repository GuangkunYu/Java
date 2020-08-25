package arraylist_grammar;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */

import java.util.ArrayList;

public class ArrayListStudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> stus = new ArrayList<>();

        Student stu1 = new Student("张三",26);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王五",30);

        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);

        for (int i=0; i<stus.size();i++){
            System.out.println(stus.get(i).getName() + ", " + stus.get(i).getAge());
        }

    }
}
