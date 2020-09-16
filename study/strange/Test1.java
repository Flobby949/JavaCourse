package com.java.lavaclone.study.strange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/26
 * @ClassName :
 */

public class Test1 extends JFrame {

    JTextArea jt1 = null;
    JButton jb = null;

    public Test1(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());

        jt1 = new JTextArea(8,15);
        jb = new JButton("按钮");


        jt1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                String string = "鼠标位置：（" + e.getX() + "，" + e.getY() +"）";
                jt1.setText(string);
            }
        });

        jt1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                jt1.setText("文本得到焦点");
            }

            @Override
            public void focusLost(FocusEvent e) {
                jt1.setText("文本失去焦点");
            }
        });

        con.add(jt1);
        con.add(jb);

        this.setSize(300,200);
        this.setLocation(900,400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Test1("测试");
    }
}
