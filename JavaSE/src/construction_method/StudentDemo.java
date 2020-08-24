package construction_method;

public class StudentDemo {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();
        s.show();

        Student s2 = new Student("张三");
        s2.show();

        Student s3 = new Student(18);
        s3.show();

        Student s4 = new Student("张三", 20);
        s4.show();
    }
}
