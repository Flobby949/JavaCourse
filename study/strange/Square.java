package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/24
 * @ClassName :正方形
 */

public class Square implements polygon {
    private int edge = 4;
    @Override
    public void circumference() {
        int c = edge*4;
        System.out.println(c+" 厘米");
    }

    @Override
    public void area() {
        int s = edge*edge;
        System.out.println(s+" 平方厘米");
    }
}