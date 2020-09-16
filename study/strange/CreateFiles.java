package com.java.lavaclone.study.strange;

import java.io.File;
import java.io.IOException;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/6
 * @ClassName :创建文件 io类
 */

public class CreateFiles {
    public static void main(String[] args) {
        File file = new File("D:\\Case\\myDir");
        if(!file.exists()) {
            file.mkdirs();
            System.out.println("目录创建成功");
        }else{
            System.out.println("目录以存在");
        }
        File txt = new File(file,"我的青春我做主.txt");
        try{
            if(txt.createNewFile()) {
                System.out.println("文件创建成功！");

            } else {
                System.out.println("文件已经存在。");
            }
            System.out.println("绝对路径为："+txt.getAbsolutePath());
            System.out.println("文件名为："+txt.getName());
            System.out.println("父路径为："+txt.getParent());
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
        if (txt.exists()){
            txt.delete();
            System.out.println("已删除");
        }else {
            System.out.println("不存在此文件");
        }
    }
}
