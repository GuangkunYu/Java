package arraylist_grammar;

/*
    集合：
        集合类的特点（ArrayList）：
            提供一种存储空间可变的存储模型，存储的数据容量可以发生改变
        ArrayList<E>:
            可调整大小的数组实现
            <E>：是一种特殊的数据类型，范型
        怎么用：
            在出现E的地方，使用引用数据类型替换即可
            举例：ArrayList<String>, ArrayList<Student>

        ArrayList构造方法和添加方法：
                方法名                                         说明
            public ArrayList()                          创建一个空的集合对象
            public boolean add(E e)                     将指定的元素追加到此集合的末尾
            public void add(int index, E element)       在此集合中的指定位置插入指定的元素

 */

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> array = new ArrayList<>();

        // 添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        // 指定位置添加元素
        array.add(1,"javase");

        // 输出集合
        System.out.println(array);


    }
}
