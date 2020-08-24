package construction_method;

/*
    标准类制作：
        成员变量：
            使用private修饰
        构造方法：
            提供一个无参构造方法
            提供一个带多个参数的构造方法
        成员方法：
            提供每一个成员变量对应的setXxx()和getXxx()
            提供一个显示对象信息的show()
        创建对象并为其成员变量赋值的两种方式
            无参构造方法创建对象后使用setXxx()赋值
            使用带参构造方法直接创建带有属性值的对象
 */
public class Standard {
    private String name;
    private int age;

    // 构造方法
    public Standard() {
    }

    public Standard(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show(){
        System.out.println(name + "," + age);
    }
}
