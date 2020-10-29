package method_reference.class_method_02;

/*
    引用类的实例方法：
        其实就是引用类中的成员方法
        格式：
            类名::成员方法
        范例：
            String::substring
            String类中的方法：public String substring(int beginIndex, int endIndex)
            从beginIndex开始到endIndex结束，截取字符串，返回一个子串，子串的长度为endIndex-beginIndex

    练习：
        定义一个接口MyString,里面定义一个抽象方法：
            String mySubString(String s, int x, int y);
        定义一个主测试类(MyStringDemo), 在测试类中提供两个方法
            一个方法是：useMyString(MyString my)
            一个方法是主方法，在主方法中调用useMyString方法
 */

public class MyStringDemo {
    public static void main(String[] args) {
        useMyString(String::substring);
    }

    private static void useMyString(MyString my){
        String s = my.mySubString("wo ai java", 1, 6);
        System.out.println(s);
    }
}
