package com.java.lavaclone.study.course;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/3
 * @ClassName :股票
 */

public class Stock {
    Scanner price = new Scanner(System.in);

    private double stockPrice;
    public Double getStockPrice(){
        System.out.println("输入价格");
        stockPrice = price.nextDouble();
        System.out.println("价格："+stockPrice);
        return stockPrice;
    }
    public double sellPrice(){
        double stock1 = 1000.00;
        DecimalFormat df = new DecimalFormat("0.00");
        double ratio = (stockPrice/stock1)-1.00;
        System.out.println("上浮"+df.format(ratio*100.00)+"%");
        return ratio;
    }
}
