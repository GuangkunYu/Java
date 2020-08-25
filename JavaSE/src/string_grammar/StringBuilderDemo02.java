package string_grammar;

/*
    StringBuilder的添加反转方法：
        public StringBuilder append(任意类型)：添加数据，并返回对象本身
        public StringBuilder reverse()：返回相反的字符序列
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilder s2 = sb.append("hello");

        System.out.println("sb:" + sb);
        System.out.println("s2:" + s2);
        System.out.println(sb == s2);

        // 链式编程
        StringBuilder s3 = new StringBuilder();
        s3.append("hello").append("world").append("java").append(100);
        System.out.println("s3:" + s3);


        s3.reverse();
        System.out.println("s3: " + s3);
    }
}
