package com.specialflow.objectSerializationFlow;

/*
    序列化三个问题：
        用对象序列化流序列化一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出现问题呢？
            java.io.InvalidClassException:
                com.specialflow.objectSerializationFlow.Student;
            local class incompatible: stream classdesc serialVersionUID = -8765042074693903517,
                                      local class serialVersionUID = 803394743384576116

        如果出现了问题，如何解决呢？
            给对象所属的类加一个值：private static final long serialVersionUID = 42L;

        如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
            private transient int age;
 */

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    // 反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO\\oos.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }

    // 序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO\\oos.txt"));
        Student s = new Student("李四", 19);
        oos.writeObject(s);
        oos.close();
    }
}
