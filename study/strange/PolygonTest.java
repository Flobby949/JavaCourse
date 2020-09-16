package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/24
 * @ClassName :测试类
 */

public class PolygonTest {
    public static void main(String[] args) {
        polygon circle = new Circle();
        circle.circumference();
        circle.area();
        System.out.println("-----------");
        polygon square = new Square();
        square.circumference();
        square.area();
        System.out.println("-----------");
        polygon triangle = new Triangle();
        triangle.circumference();
        triangle.area();
    }
}