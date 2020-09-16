package com.java.lavaclone.study.test;

import com.java.lavaclone.study.course.InformationCard;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/7
 * @ClassName :信用卡测试
 */

public class InformationCardTest {
    public static void main(String[] args) {
        InformationCard information1 = new InformationCard();
        information1.setInfo("VALID THRU(m/y):");
        System.out.print(information1.getInfo());
        InformationCard information2 =new InformationCard();
        information2.setInfo("06/28");
        System.out.println(information2.getInfo());
    }
}
