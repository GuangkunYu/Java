package com.specialflow.objectSerializationFlow;

/*
    对象序列化流：
        对象序列化：
            就是将对象保存到磁盘中，或者在网络中传输对象
            这种机制就是使用一个字节序列表示一个对象，该字节序列包含：对象的类型、对象的数据和对象中存储的属性等信息
            字节序列写到文件之后，相当于文件中持久保存了一个对象的信息
            反之，该字节序列还可以从文件中读取回来，重构对象，对他进行反序列化

        要实现序列化和反序列化就要使用对象序列化流和对象反序列化流：
            对象序列化流：
                ObjectOutputStream
            对象反序列化流：
                ObjectInputStream


    对象序列化流：ObjectOutputStream
        将Java对象的原始数据类型和图形写入OutputStream。可以使用ObjectInputStream读取（重构）对象。
        可以通过使用流的文件来实现对象的持久存储。
        如果流是网络套接字流，则可以在另一个主机上或另一个进程中重构对象

    构造方法：
        ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream

    序列化对象的方法：
        void writeObject(Object obj)：将指定的对象写入ObjectOutputStream

    注意：
        一个对象想要被序列化，该对象所属的必须实现Serializable接口
        Serializable是一个标记接口，实现该接口，不需要重写任何方法
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO\\oos.txt"));

        // 创建对象
        Student s = new Student("张三", 38);

        // void writeObject(Object obj)：将指定的对象写入ObjectOutputStream
        oos.writeObject(s);

        // 释放资源
        oos.close();
    }
}
