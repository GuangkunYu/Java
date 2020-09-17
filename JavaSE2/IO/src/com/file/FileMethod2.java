package com.file;

/*
    File类判断和获取功能：
        isDirectory()       测试此抽象路径名表示的File是否为目录
        isFile()            测试此抽象路径名表示的File是否为文件
        exists()            测试此抽象路径名表示的File是否存在
        getAbsolutePath()   返回此抽象路径名的绝对路径名字符串
        getPath()           将此抽象路径名转换为路径名字符串
        getName()           返回由此抽象路径名表示的文件或目录的名称
        String[] list()     返回此抽象路径名表示的目录中文件和目录的名称字符串数组
        File[] listFiles()  返回此抽象路径名表示的目录中文件和目录的File对象数组
 */

import java.io.File;

public class FileMethod2 {
    public static void main(String[] args) {
        File f = new File("IO\\src\\file1\\java.txt");
//        isDirectory()       测试此抽象路径名表示的File是否为目录
        System.out.println(f.isDirectory());

//        isFile()            测试此抽象路径名表示的File是否为文件
        System.out.println(f.isFile());

//        exists()            测试此抽象路径名表示的File是否存在
        System.out.println(f.exists());

//        getAbsolutePath()   返回此抽象路径名的绝对路径名字符串
        System.out.println(f.getAbsolutePath());

//        getPath()           将此抽象路径名转换为路径名字符串
        System.out.println(f.getPath());

//        getName()           返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getName());
        System.out.println("---------------");

//        String[] list()     返回此抽象路径名表示的目录中文件和目录的名称字符串数组
        File f2 = new File("E:\\documents\\GitHub\\Java\\JavaSE2\\IO\\src");
        String[] strArary = f2.list();
        for (String str:strArary){
            System.out.println(str);
        }
        System.out.println("-----------");


//        File[] listFiles()  返回此抽象路径名表示的目录中文件和目录的File对象数组
        File f3 = new File("E:\\documents\\GitHub\\Java\\JavaSE2\\IO\\src");
        File[] files = f3.listFiles();
        for (File file:files){
            System.out.println(file.getName());
        }


    }
}
