package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/24
 * @ClassName :U盘类、
 */

public class UDisk implements USB{

    @Override
    public void insert() {
        System.out.println("U盘已插入");
    }

    @Override
    public void start() {
        System.out.println("U盘正在使用");
    }

    @Override
    public void stop() {
        System.out.println("U盘安全退出");
    }
}
