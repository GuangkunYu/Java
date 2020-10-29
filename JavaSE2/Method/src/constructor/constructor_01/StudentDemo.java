package constructor.constructor_01;

/*
    引用构造器：
        就是引用构造方法
        格式：
            类名::new
        范例：
            Student::new

    练习：
        定义一个类Student，里面有两个成员变量(name, age)
            并提供无参构造方法和带参构造方法，以及成员变量的get和set方法
        定义一个接口StudentBuilder，里面定义一个抽象方法
            Student build(String name, int age);
        定义一个测试类StudentDemo，在测试类中提供两个方法：
            一个是：useStudentBuilder(StudentBuilder s)
            一个是主方法，在主方法中调用useStudentBuilder方法
 */

public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder s){
        Student stu = s.build("张三", 20);
        System.out.println(stu.getName() + " - " + stu.getAge());
    }
}
