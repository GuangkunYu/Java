package com.recursion;

/*
    案例：遍历目录
    需求：
        给定一个路径E:\documents\GitHub\Java\JavaSE2\IO，
        请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台
    思路：
        1.根据给定的路径创建一个File对象
        2.定义一个方法，用于获取给定目录下的所有内容，参数为第一步创建的File对象
        3.获取给定的File目录下所有的文件或者目录的File数组
        4.遍历该File数组，得到每一个File对象
        5.判断该File对象是否是目录
            是：递归调用
            不是：获取绝对路径输出在控制台
        6.调用方法
 */

import java.io.File;

public class RecursionFile {
    public static void main(String[] args) {
        // 根据给定的路径创建一个File对象
        File files = new File("E:\\documents\\GitHub\\Java\\JavaSE2\\IO");

        // 调用方法
        getFilePath(files);

    }

    // 定义一个方法，用于获取给定目录下的所有内容，参数为第一步创建的File对象
    private static void getFilePath(File file){
        File[] fileSrc = file.listFiles();
//        System.out.println(fileSrc);
        if (file != null){
            for (File f:fileSrc){
                if (f.isDirectory()){
                    getFilePath(f);
                }else {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
