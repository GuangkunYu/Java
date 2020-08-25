package string_grammar;

/*
    StringBuilder 构造方法：
        public StringBuilder() 创建一个空白可变字符串对象，不含有任何内容
        public StringBuilder(String str) 根据字符串的内容，来创建可变字符串对象
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println("---------------");

        StringBuilder sb1 = new StringBuilder("hello");
        System.out.println(sb1);
        System.out.println(sb1.length());
    }
}
