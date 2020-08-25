package arraylist_grammar;

/*
    需求：
        创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
 */

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();

        st.add("hello");
        st.add("world");
        st.add("java");

        for (int i=0; i<st.size(); i++){
            System.out.println(st.get(i));
        }
//        System.out.println(st.size());
    }
}
