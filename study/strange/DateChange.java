package com.java.lavaclone.study.strange;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/3
 * @ClassName :
 */

public class DateChange {
    public static void main(String[] args) throws ParseException {

        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd,aa,HH:mm:ss", Locale.ENGLISH);
        String time1=format.format(date);
        System.out.println(time1);

        String time2="2019年03月13日 20:48:31";
        SimpleDateFormat format2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date2=format2.parse(time2);
        System.out.println(date2);

    }
}
