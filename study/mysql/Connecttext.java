package com.java.lavaclone.study.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/12
 * @ClassName :com.mysql.jdbc.Driver和DriverManager
 */

public class Connecttext {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", "root", "kobe24");
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
