package com.arraysapi;

/*
基本类型包装类
    int和String的相互转换
        基本类型包装类的最常见操作就是：用于基本类型和字符串之间的相互转换

        int 转换为 String
            valueOf(int i)：返回int参数的字符串表示形式
        String 转换为 int
            parseInt(String s)：将字符串解析为int类型，该方法是Integer类中的方法
 */
public class IntToStringDemo {
    public static void main(String[] args) {
        // int --> String
        int num = 100;
        // 方式1
        String s1 = "" + 100;
        System.out.println(s1);
        // 方式2
        String s2 = String.valueOf(num);
        System.out.println(s2);

        System.out.println("--------------");

        // String --> int
        // 方式1
        // String --> Integer --> int
        String s = "100";
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);

        // 方式2
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
