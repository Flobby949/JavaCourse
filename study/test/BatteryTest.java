package com.java.lavaclone.study.test;

import com.java.lavaclone.study.course.MobilePhone;

/**
 * @author Flobby
 * @version 1.0
 * @date 2019.12.05
 * @ClassName 电池、手机类测试
 */
public class BatteryTest {
    public static void main(String[] args) {
        // 定义手机类
        MobilePhone phone = new MobilePhone();
        // 调用电池类
        MobilePhone.charge();
        // 调用播放音乐
        MobilePhone.playMusic();
        // 调用下载音乐
        MobilePhone.downloadMusic();
    }
}
