package com.anli;

/*
    复制文件加入异常处理
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {

    }
    // JDK9改进版

    // JDK7的改进方案：自动释放资源
    private static void method3(){
        try(FileReader fr = new FileReader("arrayListToTxt");
            FileWriter fw = new FileWriter("fw.txt");){
            char[] chs = new char[1024];
            int len;
            while ((len=fr.read())!=-1){
                fw.write(chs, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    // try..catch...finally
    private static void method2() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("arrayListToTxt");
            fw = new FileWriter("fw.txt");
            char[] chs = new char[1024];
            int len;
            while ((len=fr.read())!=-1){
                fw.write(chs, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (fr!=null){
                try{
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    // 抛出处理
    private static void method1() throws IOException {
        FileReader fr = new FileReader("arrayListToTxt");
        FileWriter fw = new FileWriter("fw.txt");

        char[] chs = new char[1024];
        int len;
        while ((len=fr.read())!=-1){
            fw.write(chs, 0, len);
        }

        fw.close();
        fr.close();
    }
}

