package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/24
 * @ClassName :测试类
 */

public class USBTest {
    public static void main(String[] args) {
        USB udisk = new UDisk();
        udisk.insert();
        udisk.start();
        udisk.stop();
        System.out.println("---------");
        USB mobileharddisk = new MobileHardDisk();
        mobileharddisk.insert();
        mobileharddisk.start();
        mobileharddisk.stop();
        System.out.println("---------");
        USB mouse = new Mouse();
        mouse.insert();
        mouse.start();
        mouse.stop();
    }
}
