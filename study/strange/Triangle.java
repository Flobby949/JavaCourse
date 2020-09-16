package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/24
 * @ClassName :三角形
 */

public class Triangle implements polygon {

    private int edge1 = 3;
    private int edge2 = 5;
    private int bottomedge = 4;
    private int height = 3;

    @Override
    public void circumference() {
        int c = edge1+edge2+ bottomedge;
        System.out.println(c+" 厘米");
    }

    @Override
    public void area() {
        int s = (bottomedge*height)/2;
        System.out.println(s+" 平方厘米");
    }
}

