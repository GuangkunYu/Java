package com.file;


/*
    File类删除功能：
        delete()    删除由此抽象路径名表示的文件或目录

    绝对路径和相对路径的区别：
        绝对路径：
            完整的路径名，不需要任何其他信息就可以定位它所表示的文件。
            如：E:\\itcast\\java.txt
        相对路径：
            必须使用取自其他路径名的信息进行解释
            例如：
                myFile\\java.txt

    删除目录时的注意事项：
        如果一个目录中有内容（目录，文件），不能直接删除，
        应该先删除目录中的内容，最后才能删除目录
 */

import java.io.File;

public class FileMethod3 {
    public static void main(String[] args) {
        File f = new File("IO\\src\\file1\\javase.txt");
        System.out.println(f.delete());
    }
}
