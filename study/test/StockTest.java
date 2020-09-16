package com.java.lavaclone.study.test;

import com.java.lavaclone.study.course.Stock;
import com.java.lavaclone.study.exceptions.StockRatioException;


/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/3
 * @ClassName :
 */

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.getStockPrice();
        try {
            if (stock.sellPrice()>=0.10){
                throw new StockRatioException("涨幅超过10%，价格异常");
            }
        }catch (Exception ex){
            System.out.println("捕获异常");
            ex.printStackTrace();
        }
    }
}
