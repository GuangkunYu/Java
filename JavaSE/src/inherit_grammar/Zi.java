package inherit_grammar;

public class Zi extends Fu{
    public int age = 20;
    public int height = 175;

    public void method(){
        int age = 30;
        System.out.println("Zi类method方法");
        System.out.println(age);
        System.out.println(height);
        // 本类的成员变量
        System.out.println(this.age);
        // 父类的成员变量
        System.out.println(super.age);
    }
}
