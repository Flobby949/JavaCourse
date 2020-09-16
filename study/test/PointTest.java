package com.java.lavaclone.study.test;

import com.java.lavaclone.study.model.Point;
import com.java.lavaclone.study.util.Calculation;

import java.text.DecimalFormat;

/**
 * @author Flobby
 * @version 1.0
 * @date 20191204
 * @ClassName 计算
 */
public class PointTest {
    public static void main(String[] args) {

        Point p1 = new Point(10.5, 10.5);

        Point p2 = new Point(20.6, 20.6);

        // 计算距离
        double distance = Calculation.getDistance(p1, p2);
        // 双精度
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(distance));

    }
}
