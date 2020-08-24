package classes_and_objects;

/*
    类的定义：
        1、定义类
        2、编写类的成员变量
        3、编写类的成员方法
        例如：
            public class 类名{
                // 成员变量
                变量1的数据类型 变量1;
                变量2的数据类型 变量2;
                ...
                // 成员方法
                方法1;
                方法2;
                ...
    对象的使用：
        创建对象:
            格式：
                类名 对象名 = new 类名();
            范例：
                Phone p = new Phone();
        使用对象:
            使用成员变量：
                格式：
                    对象名.变量名
                范例：
                    p.brand
            使用成员方法：
                格式：
                    对象名.方法名()
                范例：
                    p.call()
 */

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "小米";
        p.price = 2999;
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.sendMessage();
    }
}


