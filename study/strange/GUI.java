package com.java.lavaclone.study.strange;

import javax.swing.*;
import java.awt.*;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/24
 * @ClassName :布局
 */

public class GUI extends JFrame {
    String[] choice = new String[]{"是","否"};
    JLabel title = new JLabel("会员登记录入");
    JLabel name = new JLabel("姓    名");
    JLabel age = new JLabel("年    龄");
    JLabel tel = new JLabel("联系方式");
    JLabel type = new JLabel("类    型");
    JLabel count = new JLabel("折    扣");
    JLabel loss = new JLabel("是否挂失");
    JLabel company = new JLabel("工作单位");
    JTextField textField1 = new JTextField("刘富贵");
    JTextField textField2 = new JTextField("30");
    JTextField textField3 = new JTextField("11223344556");
    JTextField textField4 = new JTextField("普通会员");
    JTextField textField5 = new JTextField("0.8");
    JTextField textField6 = new JTextField(30);
    JComboBox<String> jComboBox = new JComboBox<>(choice);

    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();

    public GUI() throws HeadlessException {

        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new java.awt.Font("会员登记录入",1,20));

        jPanel1.setLayout(new GridLayout(3,4,1,1));
        jPanel1.add(name);jPanel1.add(textField1);jPanel1.add(age);jPanel1.add(textField2);
        jPanel1.add(tel);jPanel1.add(textField3);jPanel1.add(type);jPanel1.add(textField4);
        jPanel1.add(count);jPanel1.add(textField5);jPanel1.add(loss);jPanel1.add(jComboBox);

        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(company);
        jPanel2.add(textField6);

        add(title,BorderLayout.NORTH);
        add(jPanel1,BorderLayout.WEST);
        add(jPanel2,BorderLayout.SOUTH);

        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}
