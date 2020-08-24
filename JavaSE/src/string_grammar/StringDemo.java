package string_grammar;

/*
    String:
        String类代表字符串，Java程序中所有的双引号字符串，都是String类的对象
    字符串的特点：
        字符串不可变，他们的值在创建后不能被更改
        虽然String的值不可变的，但是他们可以被共享
        字符串效果上相当于字符数组（char[],jdk8以前），但是底层原理是字节数组（byte[],jdk9以后）

    String构造方法：
        方法名                             说明
        public String()               创建一个空白字符串对象，不含有任何内容
        public String(char[] chs)     根据字符数组的内容，来创建字符串对象
        public String(byte[] bys)     根据字节数组的内容，来创建字符串对象
        String s = "abc";             直接赋值的方式创建字符串，内容就是abc

 */

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        String s4 = "abc";
        System.out.println("s4:" + s4);

    }
}
