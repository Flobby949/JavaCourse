package com.java.lavaclone.study.model;

/**
 * @author Flobby
 * @version 1.0
 * @date 20191204
 * @ClassName 设点
 */
public class Point {
    /**
     * 封装x横坐标
     */
    private Double x;
    /**
     * 封装y纵坐标
     */
    private Double y;

    public Point(Double x, Double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point() {
        super();

    }

    public Double getAbscissa() {
        return x;
    }

    public void setAbscissa(Double x) {
        this.x = x;
    }

    public Double getOrdinate() {
        return y;
    }

    public void setOrdinate(Double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point (x=" + x + ", y=" + y + ")";

    }

}