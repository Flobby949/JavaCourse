package com.java.lavaclone.study.test;

import com.java.lavaclone.study.course.Manage;

/**
 * @author Flobby
 * @version 1.0
 * @date 2019.12.05
 * @ClassName 管理员测试
 */
public class ManageTest {
    public static void main(String[] args) {

        Manage a = new Manage();
        a.username = "love";
        a.password = 1234;

        a.showUserName();
        a.showPassword();
    }
}

