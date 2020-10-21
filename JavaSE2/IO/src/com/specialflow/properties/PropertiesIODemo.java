package com.specialflow.properties;

/*
    Properties和IO流结合的方法：
        void load(InputStream inStream):
            从输入字节流读取属性列表（键和元素对）
        void load(Reader reader)：
            从输入字符流读取属性列表（键和元素对）
        void store(OutputStream out, String comments)：
            将此属性列表（键和元素对）写入此Properties表中，以适合用于load(InputStream)方法的格式写入输出字节流
        void store(Writer writer, String comments)：
            将此属性列表（键和元素对）写入此Properties表中，以适合用于load(Reader)方法的格式写入输出字符流
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesIODemo {
    public static void main(String[] args) throws IOException {
        // 把集合中的数据保存到文件
        myStore();

        // 把文件中的数据加载到集合
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("IO\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("0001", "张三");
        prop.setProperty("0002", "李四");
        prop.setProperty("0003", "王五");

        FileWriter fw = new FileWriter("IO\\fw.txt");
        prop.store(fw, null);
        fw.close();
    }
}
