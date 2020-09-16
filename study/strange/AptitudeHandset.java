package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/23
 * @ClassName :智能手机
 */

public class AptitudeHandset extends HandSet implements TakePhotos,Network{

    public AptitudeHandset(String brand, String type) {
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
    public void takephotos() {
        System.out.println("拍照片");
    }

    @Override
    public void networkConnect() {
        System.out.println("成功连接网络");
    }
}
