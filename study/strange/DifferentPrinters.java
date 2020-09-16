package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/20
 * @ClassName :不同打印机类
 */

public class DifferentPrinters{

    static class BandWPrinter extends Printer {
        @Override
        public void print() {
            System.out.println("黑白打印");
        }
    }

    static class ColorPrinter extends Printer {

        @Override
        public void print() {
            System.out.println("彩色打印");
        }
    }

    static class ThreeDColorPrinter extends ColorPrinter{
        @Override
        public void print(){
            System.out.println("3D彩色打印");
        }
    }
}
