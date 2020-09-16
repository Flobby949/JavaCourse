package com.java.lavaclone.study.strange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/26
 * @ClassName :事件监听器
 */

public class Listener {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("按钮");
        JTextArea jTextArea = new JTextArea(5, 5);

        Listener1 listener1 = new Listener1(jTextArea);
        Listener2 listener2 = new Listener2(jTextArea);

        jTextArea.addMouseMotionListener(listener1);
        jTextArea.addFocusListener(listener2);

        jFrame.add(jTextArea);
        jFrame.add(jButton);

        jFrame.add(jButton, BorderLayout.SOUTH);
        jFrame.add(jTextArea, BorderLayout.CENTER);

        jFrame.setSize(400, 200);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

class Listener1 implements MouseMotionListener {
    private JTextArea jTextArea;

    public Listener1(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        jTextArea.setText("坐标：" + e.getX() + "," + e.getY());
    }
}

class Listener2 implements FocusListener {

    private JTextArea jTextArea;

    public Listener2(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    @Override
    public void focusGained(FocusEvent e) {
        jTextArea.setText("得到焦点");
    }

    @Override
    public void focusLost(FocusEvent e) {
        jTextArea.setText("失去焦点");
    }
}
