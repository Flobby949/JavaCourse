package com.java.lavaclone.study.mysql;

import com.java.lavaclone.study.util.DBUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/15
 * @ClassName :界面程序
 */

public class EmployeeFrame extends JFrame implements ActionListener {
    Connection connection = null;
    PreparedStatement statement = null;

    JLabel id = new JLabel("编号：");
    JLabel name = new JLabel("姓名：");
    JLabel age = new JLabel("年龄：");
    JLabel pay = new JLabel("薪水：");
    JTextField idf1 = new JTextField("1", 20);
    JTextField idf2 = new JTextField("2", 20);
    JTextField idf3 = new JTextField("3", 20);
    JTextField idf4 = new JTextField("4", 20);
    JTextField nameF1 = new JTextField("aaa", 20);
    JTextField nameF2 = new JTextField("bbb", 20);
    JTextField nameF3 = new JTextField("ccc", 20);
    JTextField nameF4 = new JTextField("ddd", 20);
    JTextField ageF1 = new JTextField("30", 20);
    JTextField ageF2 = new JTextField("23", 20);
    JTextField ageF3 = new JTextField("45", 20);
    JTextField ageF4 = new JTextField("36", 20);
    JTextField payF1 = new JTextField("5000", 20);
    JTextField payF2 = new JTextField("4000", 20);
    JTextField payF3 = new JTextField("6500", 20);
    JTextField payF4 = new JTextField("4500", 20);
    JButton insert = new JButton("插入");
    JButton delete = new JButton("删除");
    JButton addPay = new JButton("加薪");

    public EmployeeFrame() throws HeadlessException {
        Container container = this.getContentPane();
        container.setLayout(null);

        id.setBounds(10, 20, 40, 30);
        idf1.setBounds(60, 20, 50, 30);
        idf2.setBounds(120, 20, 50, 30);
        idf3.setBounds(180, 20, 50, 30);
        idf4.setBounds(240, 20, 50, 30);

        name.setBounds(10, 60, 40, 30);
        nameF1.setBounds(60, 60, 50, 30);
        nameF2.setBounds(120, 60, 50, 30);
        nameF3.setBounds(180, 60, 50, 30);
        nameF4.setBounds(240, 60, 50, 30);


        age.setBounds(10, 100, 40, 30);
        ageF1.setBounds(60, 100, 50, 30);
        ageF2.setBounds(120, 100, 50, 30);
        ageF3.setBounds(180, 100, 50, 30);
        ageF4.setBounds(240, 100, 50, 30);

        pay.setBounds(10, 140, 40, 30);
        payF1.setBounds(60, 140, 50, 30);
        payF2.setBounds(120, 140, 50, 30);
        payF3.setBounds(180, 140, 50, 30);
        payF4.setBounds(240, 140, 50, 30);

        insert.setBounds(10, 200, 100, 30);
        delete.setBounds(120, 200, 100, 30);
        addPay.setBounds(230, 200, 100, 30);

        add(id);add(idf1);add(idf2);add(idf3);add(idf4);
        add(name);add(nameF1);add(nameF2);add(nameF3);add(nameF4);
        add(age);add(ageF1);add(ageF2);add(ageF3);add(ageF4);
        add(pay);add(payF1);add(payF2);add(payF3);add(payF4);
        add(insert);add(delete);add(addPay);

        insert.addActionListener(this);
        delete.addActionListener(this);
        addPay.addActionListener(this);
        setLocation(400, 200);
        this.setSize(450, 350);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            connection = DBUtils.getConnection();
        } catch (ClassNotFoundException | SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(e.getActionCommand());
        if ("插入".equals(e.getActionCommand())) {
            String sql = "insert into employees values(?,?,?,?)";
            Integer id1 = Integer.parseInt(idf1.getText());
            String name1 = nameF1.getText();
            Integer age1 = Integer.parseInt(ageF1.getText());
            Double pay1 = Double.parseDouble(payF1.getText());
            int code1 = DBUtils.update(sql, id1, name1, age1, pay1);
            System.out.println(code1);
            Integer id2 = Integer.parseInt(idf2.getText());
            String name2 = nameF2.getText();
            Integer age2 = Integer.parseInt(ageF2.getText());
            Double pay2 = Double.parseDouble(payF2.getText());
            int code2 = DBUtils.update(sql, id2, name2, age2, pay2);
            System.out.println(code2);
            Integer id3 = Integer.parseInt(idf3.getText());
            String name3 = nameF3.getText();
            Integer age3 = Integer.parseInt(ageF3.getText());
            Double pay3 = Double.parseDouble(payF3.getText());
            int code3 = DBUtils.update(sql, id3, name3, age3, pay3);
            System.out.println(code3);
            Integer id4 = Integer.parseInt(idf4.getText());
            String name4 = nameF4.getText();
            Integer age4 = Integer.parseInt(ageF4.getText());
            Double pay4 = Double.parseDouble(payF4.getText());
            int code4 = DBUtils.update(sql, id4, name4, age4, pay4);
            System.out.println(code4);
        } else if ("删除".equals(e.getActionCommand())) {
            try {
                Statement statement1 = connection.createStatement();
                String sql1 = "delete from employees where id=1";
                statement1.executeUpdate(sql1);
                idf1.setText("null");
                nameF1.setText("null");
                ageF1.setText("null");
                payF1.setText("null");
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        } else if ("加薪".equals(e.getActionCommand())) {
            ResultSet rs1 = null;
            try {
                String sql = "update employees set pay=7150 where id=3";
                int code = DBUtils.update(sql);
                System.out.println(code);
                statement = connection.prepareStatement("select id,name,age,pay from employees where id=?");
                System.out.println(Integer.parseInt(idf3.getText()));
                statement.setInt(1, Integer.parseInt(idf3.getText()));
                rs1 = statement.executeQuery();
                while (rs1.next()) {
                    idf3.setText(rs1.getString(1));
                    nameF3.setText(rs1.getString(2));
                    ageF3.setText(rs1.getString(3));
                    payF3.setText(rs1.getString(4));
                }
            } catch (SQLException e3) {
                e3.printStackTrace();
            } finally {
                DBUtils.closeResource(connection, statement, rs1);
            }
        }
    }
    public static void main(String[] args) {
        new EmployeeFrame();
    }
}
