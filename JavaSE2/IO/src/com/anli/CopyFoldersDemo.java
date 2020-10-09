package com.anli;

/*
    需求：
        把AbstractClass复制到当前目录下
 */

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        // 创建数据源File对象，路径是：AbstractClass
        File srcFolders = new File("E:\\Code\\Java\\JavaSE2\\ AbstractClass");

        // 创建目的地File对象，路径是：IO\\src\\com\\anli\\
        File destFolders = new File("IO\\src\\com\\anli\\");

        // 写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        copyFolder(srcFolders, destFolders);
    }

    // 复制文件夹
    private static void copyFolder(File srcFolders, File destFolders) throws IOException {
        // 判断数据源File是否是目录
        if (srcFolders.isDirectory()){
            // 是：在目的地下创建和数据源File名称一样的目录
            String srcFoldersName = srcFolders.getName();
            File newFolders = new File(destFolders, srcFoldersName);
            if (!newFolders.exists()){
                newFolders.mkdir();
            }

            // 获取数据源File下所有文件或者目录的File数组
            File[] listFiles = srcFolders.listFiles();

            // 遍历File数组，得到每一个File对象
            for (File file:listFiles){
                // 把该File座位数据源File对象，递归调用复制文件夹的方法
                copyFolder(file, newFolders);
            }

        }else{
            // 不是：说明是文件，直接复制，用字节流
            File newFile = new File(destFolders, srcFolders.getName());
            copyFile(srcFolders, newFile);
        }
    }

    // 复制文件
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
