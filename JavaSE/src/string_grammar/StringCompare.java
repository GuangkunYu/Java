package string_grammar;

/*
    字符串的比较：
        使用==做比较：
            基本类型：比较的是数据值是否相同
            引用类型：比较的是地址值是否相同
        字符串是对象，通过使用equals()方法来实现内容的比较：
            public boolean equals(Object anObject):
                将此字符串与指定对象进行比较。参数直接传递一个字符串
 */

public class StringCompare {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        String s3 = "abc";
        String s4 = "abc";

        // 比较字符串对象的地址是否相同
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println("------");

        // 比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
