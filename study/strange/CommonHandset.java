package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/23
 * @ClassName :普通手机
 */

public class CommonHandset extends HandSet implements PlayWirting{

    private String inConnect;

    public CommonHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println(this.brand +"是"+this.type);
    }

    @Override
    public void call() {
        System.out.println("正在拨打电话");
    }

    @Override
    public void info() {
        System.out.println("正在发送信息");
    }

    @Override
    public void play(String inConnect) {
        this.inConnect = inConnect;
        System.out.println("正在播放"+this.inConnect);
    }
}
