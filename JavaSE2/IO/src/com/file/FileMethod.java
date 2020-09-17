package com.file;

/*
    File类创建功能：
        createNewFile()     当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
            如果文件不存在，就创建文件，并返回true
            如果文件存在，就不创建文件，并返回false
        mkdir()             创建由此抽象路径命名的目录
            如果目录不存在，就创建文件，并返回true
            如果目录存在，就不创建文件，并返回false
        mkdirs()            创建由此抽象路径名命名的目录，包括任何必须但不存在的父目录
            如果目录不存在，就创建文件，并返回true
            如果目录存在，就不创建文件，并返回false
 */


import java.io.File;
import java.io.IOException;

public class FileMethod {
    public static void main(String[] args) throws IOException {
        // createNewFile()
        File f1 = new File("E:\\documents\\GitHub\\Java\\JavaSE2\\IO\\src\\file1\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----------------------");

//        mkdir()
        File f2 = new File("E:\\documents\\GitHub\\Java\\JavaSE2\\IO\\src\\file2");
        System.out.println(f2.mkdir());
        System.out.println("----------------------");

        // mkdirs()
        File f3 = new File("E:\\documents\\GitHub\\Java\\JavaSE2\\IO\\src\\file3\\file4\\file5");
        System.out.println(f3.mkdirs());
        System.out.println("----------------------");

        File f4 = new File("E:\\documents\\GitHub\\Java\\JavaSE2\\IO\\src\\file1\\javase.txt");
//        System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());

    }
}
