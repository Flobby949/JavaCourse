package com.java.lavaclone.study.util;

import com.java.lavaclone.study.model.Point;

/**
 * @author Flobby
 * @version 1.0
 * @date 20191204
 * @ClassName 求距离
 */
public class Calculation {
    public static double getDistance(Point p1, Point p2) {
        // 计算横坐标差的平方
        double squareAbscissa = Math.pow(p1.getAbscissa() - p2.getAbscissa(), 2);
        // 计算纵坐标差的平方
        double squareOrdinate = Math.pow(p1.getOrdinate() - p2.getOrdinate(), 2);
        // 两点间距离公式
        return Math.sqrt(squareAbscissa + squareOrdinate);
    }
}
