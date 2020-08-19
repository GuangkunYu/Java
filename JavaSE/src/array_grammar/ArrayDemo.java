package array_grammar;

/*
    数组概述：
        1.一次性声明大量的用于存储数据的变量
        2.要存储的数据通常都是同类型数据，例如：考试成绩
    什么是数组：
        数组是一种用于存储多个相同类型数据的存储模型
    数组的定义格式：
        格式一：
            数据类型[] 变量名
            int[] arr
            定义了一个int类型的数组，数组名是arr
        格式二：
            数据类型 变量名[]
            int arr[]
            定义了一个int类型的变量，变量名时arr数组

    数组初始化
        数组初始化方式
            动态初始化：初始化时只指定数组长度，由系统为数组分配初始值
                格式：
                    数据类型[] 变量名 = new 数据类型[数组长度];
                    int[] arr = new int[3];
            静态初始化：初始化时指定每个数组元素的初识值，由系统决定数组长度
                格式：
                    数据类型[] 变量名 = new 数据类型[]{数据1，数据2，数据3，...};
                    int[] arr = new int[]{1, 2, 3};
                简化格式：
                    数据类型[] 变量名 = {数据1，数据2，数据3，...};
                    int[] arr = {1, 2, 3};
        数组元素访问：
            数组变量访问方式：
                格式：数组名
            数组内部保存的数据的访问方式：
                格式：数组名[索引]
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 动态初始化
        int[] arr = new int[3];
        int[] arr2 = new int[3];
        /*
            左边：
                int：说明数组中的元素类型是int类型
                []：说明这是一个数组
                arr：这是数组的名称
            右边：
                new：为数组申请内存空间
                int：说明数组中的元素类型是int类型
                []：说明这是一个数组
                3：数组长度，其实就是数组中的元素个数
         */

        // 输出数组名
        System.out.println(arr);    // [I@1b6d3586  内存空间的地址值

        // 输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


        arr[0] = 100;
        arr[2] = 200;
        arr2[0] = 200;
        arr2[2] = 300;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


        System.out.println("----------------");

        // 静态初始化
        int[] arr3 = {1, 2, 3};
        System.out.println(arr3);
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

    }
}
/*
    java中内存分配：
        栈内存：
            存储局部变量
            定义在方法中的变量，如：arr
            使用完毕，立即消失
        堆内存：
            存储new出来的内容（实体，对象）
            数组在初识化时，会为存储空间添加默认值，
                整数：0
                浮点数：0.0
                布尔：false
                字符：空字符
                引用数据类型：null
            每一个new出来的东西都有一个地址值
            使用完毕，会在垃圾回收器空闲的时候被回收
 */
