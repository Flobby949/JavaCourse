package com.java.lavaclone.study.daowork2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/22
 * @ClassName :初始面板
 */

public class OriginTable extends JFrame implements ActionListener {
    JButton Login = new JButton("Login");
    JButton Register = new JButton("Register");

    public OriginTable() throws HeadlessException{
        Container container = this.getContentPane();
        container.setLayout(null);

        Login.setBounds(95,50,100,20);
        Register.setBounds(95,110,100,20);

        add(Login);add(Register);

        Login.addActionListener(this);
        Register.addActionListener(this);

        setLocation(400, 200);
        this.setSize(300, 220);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ("Login".equals(e.getActionCommand())){
            new LoginTable();
            dispose();
        }else if ("Register".equals(e.getActionCommand())){
            new RegisterTable();
            dispose();
        }
    }


    public static void main(String[] args) {
        new OriginTable();
    }
}
