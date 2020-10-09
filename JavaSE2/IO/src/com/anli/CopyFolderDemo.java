package com.anli;

/*
    案例：复制单级目录
    需求：
        把com\bufferbytes这个文件夹复制到当前包路径下
 */

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        // 创建数据源目录File对象，路径是com\bufferbytes
        File srcForlder = new File("IO\\src\\com\\bufferbytes");

        // 获取数据源目录File对象的名称（bufferbytes)
        String srcForlderName = srcForlder.getName();

        // 创建目的地目录File对象，路径是com\anli\bufferbytes
        File destFolder = new File("IO\\src\\com\\anli\\bufferbytes");

        // 判断目的地目录对应的File是否存在，如果不存在，就创建
        if (!destFolder.exists()){
            destFolder.mkdir();
        }

        // 获取数据源目录下的所有文件的File数组
        File[] listFiles = srcForlder.listFiles();

        // 遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for (File srcFile:listFiles){
            // 获取数据源文件File对象的名称
            String srcFileName = srcFile.getName();

            // 创建目的地文件File对象，路径名是目的地目录+数据源文件名
            File destFile = new File(destFolder, srcFileName);

            // 复制文件：文件不仅有文本，还有图片视频等，所以采用字节流复制文件
            copyFile(srcFile, destFile);
        }

    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
