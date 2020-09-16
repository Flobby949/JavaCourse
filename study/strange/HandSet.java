package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/23
 * @ClassName :手机类
 */

public abstract class HandSet {

    public String brand;
    public String type;

    public HandSet(String brand,String type){
        this.brand = brand;
        this.type = type;
    }

    public void sendInfo(){

    }

    public abstract void call();
    public abstract void info();
}
