package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/24
 * @ClassName :鼠标
 */

public class Mouse implements USB{
    @Override
    public void insert() {
        System.out.println("鼠标成功插入");
    }

    @Override
    public void start() {
        System.out.println("鼠标正在使用");
    }

    @Override
    public void stop() {
        System.out.println("鼠标成功退出");
    }
}
