package com.java.lavaclone.study.course;

/**
 * @author Flobby
 * @version 1.0
 * @date 2019.12.05
 * @ClassName 管理员信息
 */
public class Manage {

    public int password;
    public String username;

    public String showUserName(){
        System.out.println("用户名："+this.username);
        return username;
    }
    public int showPassword(){
        System.out.println("密码："+this.password);
        return password;
    }
}
