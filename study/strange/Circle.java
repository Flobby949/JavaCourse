package com.java.lavaclone.study.strange;

/**
 * @version :1.0
 * @date :2020/3/24
 * @ClassName :圆
 */

public class Circle implements polygon {

    private int radius = 5;

    @Override
    public void circumference() {

        double c = 2*radius*Math.PI;
        System.out.println(String.format("%.2f",c)+" 厘米");
    }

    @Override
    public void area() {
        double s = Math.PI*radius*radius;
        System.out.println(String.format("%.2f",s)+" 平方厘米");
    }
}
