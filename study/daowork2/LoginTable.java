package com.java.lavaclone.study.daowork2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/22
 * @ClassName :登录面板
 */

public class LoginTable extends JFrame implements ActionListener {
    JLabel username = new JLabel("用户名");
    JTextField usernameJf = new JTextField(50);
    JLabel password = new JLabel("密码");
    JTextField passwordJf = new JTextField(50);
    JButton LoginButton = new JButton("登录");

    public LoginTable() throws HeadlessException {
        Container container = this.getContentPane();
        container.setLayout(null);

        username.setBounds(10, 20, 50, 20);
        usernameJf.setBounds(80, 20, 120, 20);
        password.setBounds(10, 80, 50, 20);
        passwordJf.setBounds(80, 80, 120, 20);
        LoginButton.setBounds(100, 140, 60, 30);

        add(username);
        add(usernameJf);
        add(password);
        add(passwordJf);
        add(LoginButton);

        LoginButton.addActionListener(this);

        setLocation(400, 300);
        this.setSize(300, 250);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Dao dao = new Impl2();
        List<User> userlist=null;
        User user=new User();
        user.setName(usernameJf.getText());
        user.setPassword(passwordJf.getText());
        userlist=dao.getUser(user);
        if (userlist.size()!=0){
            new StudentTable();
            dispose();
        }else {
            System.out.println("账号或密码错误，重新输入");
        }
    }
}
