package arraylist_grammar;

/*
    ArrayList集合常用方法：
                方法名                                     说明
        public boolean remove(Object o)             删除指定的元素，返回删除是否成功
        public E remove(int index)                  删除指定索引处的元素，返回被删除的元素
        public E set(int index,E element)           修改指定索引处的元素，返回被修改的元素
        public E get(int index)                     返回指定索引处的元素
        public int size()                           返回集合中的元素的个数
 */

import java.util.ArrayList;

public class CommonMethod {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("hello");
        array.add("world");
        array.add("java");

//        System.out.println(array.remove("world"));

//        System.out.println(array.remove(2));

//        System.out.println(array.set(2,"javaee"));

//        System.out.println(array.get(2));


        System.out.println(array.size());
    }
}
