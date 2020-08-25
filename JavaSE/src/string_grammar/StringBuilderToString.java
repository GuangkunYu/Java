package string_grammar;

/*
    StringBuilder和String相互转换：
        StringBuilder转换为String：
            public String toString()：
                通过toString()就可以实现把StringBuilder转换为String
        String转换为StringBuilder：
            public StringBuilder(String s):
                通过构造方法就可以实现把String转换为StringBuilder
 */

public class StringBuilderToString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        String s = sb.toString();
        System.out.println(s);

        String st = "world";
        StringBuilder sbr = new StringBuilder(st);
        System.out.println(sbr);

    }
}
