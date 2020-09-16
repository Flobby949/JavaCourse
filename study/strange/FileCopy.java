package com.java.lavaclone.study.strange;

import java.io.*;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/9
 * @ClassName :文件复制
 */

public class FileCopy {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Case\\myDir");
        File txt = new File(file,"我的青春我做主.txt");
        File txt2 = new File(file,"我的青春我做主2.txt");

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(txt);
            char [] buf = new char[1024];
            int len;
            while((len = fileReader.read(buf))!=-1) {
                System.out.println(new String(buf,0,len));
            }
        }catch(IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream in=new FileInputStream(txt);
            FileOutputStream out=new FileOutputStream(txt2);
            byte[] buffer=new byte[1024];
            int length;
            while((length=in.read(buffer))>0){
                System.out.println(new String(buffer,0,length));
                out.write(buffer);
            }
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
