package com.java.lavaclone.study.test;
import com.java.lavaclone.study.course.Client;

import java.util.Scanner;
/**
 * @author Flobby
 * @version :1.0
 * @date :2019/12/19
 * @ClassName :客户信息测试
 */

public class NameTest {
    public static void main(String[] args) {
        Client c1 = new Client();
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag){
            System.out.println("输入用户姓名：");
            String name = input.next();
            c1.addName(name);
            System.out.println("是否继续输入？(y/n)");
            String choice = input.next();
            if(choice.equals("n")){
                flag = false;
            }

        }
        c1.showName();

    }
}
