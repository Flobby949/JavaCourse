package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/24
 * @ClassName :移动硬盘
 */

public class MobileHardDisk implements USB{
    @Override
    public void insert() {
        System.out.println("移动硬盘已成功插入");
    }

    @Override
    public void start() {
        System.out.println("移动硬盘正在使用");
    }

    @Override
    public void stop() {
        System.out.println("移动硬盘成功退出");
    }
}
