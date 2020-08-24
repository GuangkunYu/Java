package construction_method;

/*
    构造方法：
        概述：
            构造方法是一种特殊的方法
        作用：
            创建对象
        格式：
            public class 类名{
                修饰符 类名(参数){

                }
            }
        功能：
            主要是完成对象数据的初始化

    构造方法的注意事项：
        构造方法的创建
            如果没有定义构造方法，系统将给出一个默认的无参数构造方法
            如果定义了构造方法，系统将不再提供默认的构造方法
        构造方法的重载：
            如果自定义了带参构造方法，还要使用无参构造方法，就必须再写一个无参数构造方法
        推荐的使用方式：
            无论是否使用，都手工书写无参数构造方法
 */
public class Student {
    private String name;
    private int age;

    // 构造方法
    public Student(){
        System.out.println("无参构造方法");
    }

    // 有参构造方法
    public Student(String name){
        System.out.println("有参构造方法");
        this.name = name;
    }

    public Student(int age){
        System.out.println("有参构造方法");
        this.age = age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name + "," + age);
    }
}
