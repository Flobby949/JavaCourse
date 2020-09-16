package com.java.lavaclone.study.util;

/**
 * @version :1.0
 * @date :2020/5/15
 * @ClassName :
 * @author Flobby
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";

        Connection connection = null;
        PreparedStatement statement = null;
        connection = DriverManager.getConnection(url, "root", "kobe24");
        /*System.out.println(connection);*/

        return connection;
    }

    public static void closeResource(Connection connection, Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public static void closeResource(Connection connection, Statement statement, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public static int update(Connection connection, String sql, Object... objs) {

        PreparedStatement statement = null;
        int code = 0;
        try {
            statement = connection
                    .prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                statement.setObject(i + 1, objs[i]);
            }
            code = statement.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        closeResource(null, statement);

        return code;

    }

    public static int update(String sql, Object... objs) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, "root", "kobe24");
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        int code = 0;
        PreparedStatement statement = null;
        try {
            statement = connection
                    .prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                statement.setObject(i + 1, objs[i]);
            }
            code = statement.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        closeResource(connection, statement);

        return code;
    }

    public static List<Map<String, Object>> query(String sql, Object...objs){
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();

        try {
            connection=DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            for(int i=0;i<objs.length;i++){
                statement.setObject(i+1, objs[i]);
            }
            rs=statement.executeQuery();

            ResultSetMetaData rsmd=rs.getMetaData();

            while(rs.next()){
                HashMap<String, Object> entry=new HashMap<>();
                for(int i=0;i<rsmd.getColumnCount();i++){
                    entry.put(rsmd.getColumnLabel(i+1), rs.getObject(i+1));
                }
                list.add(entry);
            }
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            closeResource(connection, statement,rs);
        }

        return list;
    }
}

