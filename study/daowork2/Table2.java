package com.java.lavaclone.study.daowork2;


import com.java.lavaclone.study.daowork1.Student;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.util.List;
import java.util.Vector;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/20
 * @ClassName :
 */

public class Table2 extends JFrame {
    public Table2(List<Student2> list) {

        Vector<Vector<Object>> vectordata=new Vector<>();

        for(Student2 student:list){
            Vector<Object> objs=new Vector<>();
            objs.add(student.getId());
            objs.add(student.getName());
            objs.add(student.getAge());
            objs.add(student.getScore());
            vectordata.add(objs);
        }

        String[] labels={"学号","姓名","年龄","成绩"};

        Vector<String> columnNames=new Vector<>();
        for(String label:labels){
            columnNames.add(label);
        }

        JTable table=new JTable(vectordata, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new TitledBorder(null, "总面板", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));

        this.getContentPane().add(panel);

        panel.add(scrollPane);
        scrollPane.setBounds(15, 15, 300, 200);
        scrollPane.setBorder(new TitledBorder(null, "分数面板",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setSize(420, 300);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

