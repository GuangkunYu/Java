package com.bytes;

/*
    案例：复制图片

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopyImage {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("IO\\src\\com\\timg.jpg");

        FileOutputStream fos = new FileOutputStream("IO\\src\\com\\bytes\\timg.jpg");

        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys)) != -1){
            fos.write(bys, 0, len);
        }

        fis.close();
        fos.close();
    }
}
