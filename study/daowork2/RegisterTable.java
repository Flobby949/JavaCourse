package com.java.lavaclone.study.daowork2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/22
 * @ClassName :注册面板
 */

public class RegisterTable extends JFrame implements ActionListener {
    JLabel username = new JLabel("请输入用户名：");
    JTextField usernameJf = new JTextField(50);
    JLabel password1 = new JLabel("请输入密码：");
    JTextField passwordJf1 = new JTextField(50);
    JLabel password2 = new JLabel("请再次输入密码：");
    JTextField passwordJf2 = new JTextField(50);
    JButton RegisterButton = new JButton("注册");

    public RegisterTable() throws HeadlessException {
        Container container = this.getContentPane();
        container.setLayout(null);

        username.setBounds(10,20,100,20);
        usernameJf.setBounds(120,20,120,20);
        password1.setBounds(10,80,100,20);
        passwordJf1.setBounds(120,80,120,20);
        password2.setBounds(10,140,100,20);
        passwordJf2.setBounds(120,140,120,20);
        RegisterButton.setBounds(100,200,60,30);


        add(username);add(usernameJf);
        add(password1);add(passwordJf1);
        add(password2);add(passwordJf2);
        add(RegisterButton);
        RegisterButton.addActionListener(this);

        setLocation(400, 300);
        this.setSize(300, 350);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Dao dao = new Impl2();
        String pw1 = passwordJf1.getText();
        String pw2 = passwordJf2.getText();
        if (pw1.equals(pw2)) {
            User user = new User();
            user.setName(usernameJf.getText());
            user.setPassword(passwordJf1.getText());
            int code = dao.add(user);
            System.out.println(code);
            new OriginTable();
            dispose();
        }else{
            System.out.println("密码不同，输入错误,请重新注册。");
        }
    }
}
