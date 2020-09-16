package com.java.lavaclone.study.course;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/7
 * @ClassName :信用卡
 */

public class InformationCard<T> {
    private T info;
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
}
