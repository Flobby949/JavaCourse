package com.java.lavaclone.study.daowork2;

import com.java.lavaclone.study.daowork1.Student;

import com.java.lavaclone.study.util.DBUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/22
 * @ClassName :学生管理面板
 */

public class StudentTable extends JFrame implements ActionListener {
    JLabel id = new JLabel("学号：");
    JLabel name = new JLabel("姓名：");
    JLabel age = new JLabel("年龄：");
    JLabel score = new JLabel("成绩：");
    JTextField idTf = new JTextField();
    JTextField nameTf = new JTextField();
    JTextField ageTf = new JTextField();
    JTextField scoreTf = new JTextField();
    JTextField searchTf = new JTextField();
    JButton insert = new JButton("插入");
    JButton search = new JButton("查询");
    JButton searchAll = new JButton("查询所有记录");

    public StudentTable() throws HeadlessException {
        Container container = this.getContentPane();
        container.setLayout(null);
        id.setBounds(10, 20, 40, 30);
        idTf.setBounds(60, 20, 60, 30);
        name.setBounds(10, 60, 40, 30);
        nameTf.setBounds(60, 60, 60, 30);
        age.setBounds(10, 100, 40, 30);
        ageTf.setBounds(60, 100, 60, 30);
        score.setBounds(10, 140, 40, 30);
        scoreTf.setBounds(60, 140, 60, 30);
        searchTf.setBounds(321,70,40,30);
        insert.setBounds(240, 20, 80, 30);
        search.setBounds(210, 70, 80, 30);
        searchAll.setBounds(190, 120, 180, 30);
        add(id);add(idTf);add(name);add(nameTf);
        add(age);add(ageTf);add(score);add(scoreTf);
        add(insert);add(search);add(searchTf);add(searchAll);
        insert.addActionListener(this);
        search.addActionListener(this);
        searchAll.addActionListener(this);
        setLocation(400, 200);
        this.setSize(450, 250);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Dao dao = new Impl2();
        if ("插入".equals(e.getActionCommand())){
            String sql = "insert into daowork2 values(?,?,?,?)";
            Integer id1 = Integer.parseInt(idTf.getText());
            String name1 = nameTf.getText();
            Integer age1 = Integer.parseInt(ageTf.getText());
            Double score1 = Double.parseDouble(scoreTf.getText());
            int code1 = DBUtils.update(sql, id1, name1, age1, score1);
            System.out.println(code1);
            idTf.setText("");nameTf.setText("");ageTf.setText("");scoreTf.setText("");
        }else if ("查询".equals(e.getActionCommand())){
            java.util.List<Student2> list1 = null;
            list1 = dao.getStudent(Integer.parseInt(searchTf.getText()));
            new Table2(list1);
            searchTf.setText("");
        }else if ("查询所有记录".equals(e.getActionCommand())){
            List<Student2> list2= null;
            list2 = dao.getAll();
            new Table2(list2);
        }
    }
}
