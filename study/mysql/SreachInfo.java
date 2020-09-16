package com.java.lavaclone.study.mysql;

import java.sql.*;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/15
 * @ClassName :查询表
 */

public class SreachInfo {
    public static void main(String[] args) throws SQLException {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", "root", "kobe24");
            System.out.println(connection);
            Statement statement = connection.createStatement();
            String str = "SELECT * FROM news";
            ResultSet resultSet = statement.executeQuery(str);
            System.out.println("----------------");

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String name = resultSet.getString("name");
                Date time = resultSet.getDate("time");

                System.out.printf(id+"\t"+title+"\t"+name+"\t"+time+"\n");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
