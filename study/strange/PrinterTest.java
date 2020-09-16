package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/20
 * @ClassName :测试类
 */

public class PrinterTest {
    public static void main(String[] args) {

        DifferentPrinters.BandWPrinter bandWPrinter = new DifferentPrinters.BandWPrinter();
        bandWPrinter.print();

        DifferentPrinters.ColorPrinter colorPrinter = new DifferentPrinters.ColorPrinter();
        colorPrinter.print();

        DifferentPrinters.ThreeDColorPrinter threeDColorPrinter = new DifferentPrinters.ThreeDColorPrinter();
        threeDColorPrinter.print();


    }
}
