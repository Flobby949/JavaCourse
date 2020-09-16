package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/23
 * @ClassName :测试类
 */

public class HandsetTest {
    public static void main(String[] args) {
        CommonHandset handSet1 = new CommonHandset("Nokia","普通手机");
        handSet1.sendInfo();
        handSet1.call();
        handSet1.info();
        handSet1.play("LOSER");
        System.out.println("-----------");
        AptitudeHandset handset2 = new AptitudeHandset("Apple","智能手机");
        handset2.sendInfo();
        handset2.call();
        handset2.info();
        handset2.takephotos();
        handset2.networkConnect();
    }
}
