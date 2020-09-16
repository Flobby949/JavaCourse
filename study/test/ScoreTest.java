package com.java.lavaclone.study.test;

import com.java.lavaclone.study.course.Score;

import java.util.Scanner;

/**
 * @author Flobby
 * @version 1.0
 * @date 2019.12.05
 * @ClassName 成绩测试
 */
public class ScoreTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Score student1 = new Score();
        //录入java成绩
        System.out.println("请输入java成绩：");
        student1.java = scan.nextFloat();
        //录入c成绩
        System.out.println("请输入c成绩：");
        student1.c = scan.nextFloat();
        //录入python成绩
        System.out.println("请输入python成绩");
        student1.python = scan.nextFloat();

        //调用总成绩方法
        student1.showScoreSum();
        //调用平均成绩方法
        student1.showScoreAverage();


    }
}
