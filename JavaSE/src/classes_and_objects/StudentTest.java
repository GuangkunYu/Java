package classes_and_objects;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.study();
        stu.doHomework();
    }
}
