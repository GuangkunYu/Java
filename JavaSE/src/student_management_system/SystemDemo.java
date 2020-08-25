package student_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            int choose = interfaceShow();
            if (choose == 1) {
                // 添加
                addStudent(students);
            } else if (choose == 2) {
                // 删除
                delStudent(students);
            } else if (choose == 4) {
                // 查看所有
                searchStudent(students);
            } else if (choose == 3) {
                // 修改
                updateStudent(students);
            } else if (choose == 5) {
                System.out.println("谢谢使用！");
                break;
            }
        }
    }

    // 界面显示方法
    public static int interfaceShow() {
        System.out.println("----------欢迎来到学生管理系统----------");
        System.out.println("1、添加学生");
        System.out.println("2、删除学生");
        System.out.println("3、修改学生");
        System.out.println("4、查看所有学生");
        System.out.println("5、退出");
        System.out.println("请输入你的选择：");

        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();

        return choose;
    }


    // 添加学生信息方法
    public static void addStudent(ArrayList<Student> students) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生的学号：");
        String userid = sc.nextLine();
        System.out.println("请输入学生的姓名：");
        String username = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        String userage = sc.nextLine();
        System.out.println("请输入学生的居住地址：");
        String useraddress = sc.nextLine();

        stu.setSid(userid);
        stu.setName(username);
        stu.setAge(userage);
        stu.setAddress(useraddress);

        students.add(stu);

        System.out.println("添加成功");
    }

    // 查看学生信息方法
    public static void searchStudent(ArrayList<Student> students) {
        if (students.size()==0){
            System.out.println("无信息，请先添加信息");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地址");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getSid() + "\t\t\t" +
                    s.getName() + "\t\t" +
                    s.getAge() + "岁" + "\t\t" +
                    s.getAddress());
        }
    }

    // 删除学生信息方法
    public static void delStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生学号：");
        String delid = sc.nextLine();

        int index = -1;

        for (int i =0;i<students.size(); i++){
            Student s = students.get(i);
            if (delid.equals(s.getSid())){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("信息不存在");
        }else{
            students.remove(index);
            System.out.println("删除成功");
        }

    }

    // 修改学生信息方法
    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要修改的学生学号：");
        String updateid = sc.nextLine();

        System.out.println("修改学号：");
        String newid = sc.nextLine();
        System.out.println("修改姓名：");
        String newname = sc.nextLine();
        System.out.println("修改年龄：");
        String newage = sc.nextLine();
        System.out.println("修改居住地址：");
        String newaddress = sc.nextLine();

        for (int i =0;i<students.size(); i++){
            Student s = students.get(i);
            if (updateid.equals(s.getSid())){

                s.setSid(newid);
                s.setName(newname);
                s.setAge(newage);
                s.setAddress(newaddress);

                break;
            }
        }
        System.out.println("修改成功");
    }
}
