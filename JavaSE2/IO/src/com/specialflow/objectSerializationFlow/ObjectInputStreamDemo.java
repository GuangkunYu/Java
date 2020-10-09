package com.specialflow.objectSerializationFlow;

/*
    对象反序列化流：ObjectInputStream
        ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象

        构造方法：
            ObjectInputStream(InputStream in)：创建从指定的InputStream读取的ObjectInputStream

        反序列化对象的方法：
            Object readObject()：从ObjectInputStream读取一个对象
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ObjectInputStream(InputStream in)：创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO\\oos.txt"));

        Object o = ois.readObject();

        Student s = (Student) o;
        System.out.println(s.getName() + "," + s.getAge());

        ois.close();
    }
}
