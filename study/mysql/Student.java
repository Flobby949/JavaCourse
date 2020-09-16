package com.java.lavaclone.study.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/12
 * @ClassName :表格
 */

public class Student {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", "root", "kobe24");
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Statement statement = connection.createStatement();

        /**
         * 增加
         */
        String sql1 = "insert into student values('2','bbb','2020-1-1','80')";
        String sql2 = "insert into student values('3','ccc','2020-5-1','60')";
        statement.executeUpdate(sql1);
        statement.executeUpdate(sql2);

        /**
         * 删除
         */
        String sql3 = "delete from student where id='1'";
        statement.executeUpdate(sql3);
    }
}
