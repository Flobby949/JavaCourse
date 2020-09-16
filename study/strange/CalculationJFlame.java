package com.java.lavaclone.study.strange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/21
 * @ClassName :
 */

public class CalculationJFlame extends JFrame{

    JLabel label1 = new JLabel("在此输入数字:");
    JTextField textField1 = new JTextField(15);
    JButton calculation = new JButton("计算");
    JLabel label2 = new JLabel("运算结果：");
    JTextField textField2 = new JTextField(20);
    public CalculationJFlame() throws HeadlessException {
        calculation.setToolTipText("计算当前数字的立方次幂");
        setLayout(new FlowLayout());
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(calculation);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String figure = textField1.getText();
                textField2.setText((String.valueOf(Math.pow(Double.parseDouble(figure), 3))));
            }
        };
        calculation.addActionListener(a1);
    }

    public static void main(String[] args) {
        new CalculationJFlame().setVisible(true);
    }
}
