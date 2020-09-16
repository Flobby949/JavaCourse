package com.java.lavaclone.study.strange;

import java.io.*;



/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/9
 * @ClassName :缓冲区
 */

public class BufferedOutputStreamCopy {
    public static void main(String[] args) throws IOException {
        try {
            dump(new FileInputStream("D:\\Case\\myDir\\ACO.png"),
                 new FileOutputStream("E:\\Case\\myDir\\ACO.png"));
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void dump(FileInputStream fileInputStream, FileOutputStream fileInputStream1) throws IOException {
        InputStream inputStream = new BufferedInputStream(fileInputStream);
        OutputStream outputStream = new BufferedOutputStream(fileInputStream1);
        byte[] bytes = new byte[1024];
        int length = -1;
        while ((length = inputStream.read(bytes)) !=-1){
            outputStream.write(bytes,0,length);
        }
        inputStream.close();
        outputStream.close();
    }
}
