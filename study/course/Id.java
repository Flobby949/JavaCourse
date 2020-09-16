package com.java.lavaclone.study.course;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/7
 * @ClassName :身份证类
 */

public class Id {

    private int IDNumber;

    public Id(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    @Override
    public String toString() {
        return "身份证号码:" + IDNumber;
    }
}
