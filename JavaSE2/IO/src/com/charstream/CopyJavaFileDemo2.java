package com.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaFileDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IO\\src\\com\\charstream\\BytesStringDemo.java");
        FileWriter fw = new FileWriter("IO\\src\\com\\Copy");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1){
            fw.write(chs, 0, len);
        }

        fr.close();
        fw.close();
    }
}
