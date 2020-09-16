package com.java.lavaclone.study.daowork1;


import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/20
 * @ClassName :
 */

public class Table extends JFrame {
    public Table(List<Student> list) {

        Vector<Vector<Object>> vectordata=new Vector<>();

        for(Student student:list){
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

