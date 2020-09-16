package com.java.lavaclone.study.daowork1;

import com.java.lavaclone.study.util.DBUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/20
 * @ClassName :
 */

public class Gui extends JFrame implements ActionListener {

    JLabel id = new JLabel("学号：");
    JLabel name = new JLabel("姓名：");
    JLabel age = new JLabel("年龄：");
    JLabel score = new JLabel("成绩：");
    JTextField idf1 = new JTextField("1", 20);
    JTextField idf2 = new JTextField("2", 20);
    JTextField idf3 = new JTextField("3", 20);
    JTextField idf4 = new JTextField("4", 20);
    JTextField nameF1 = new JTextField("aaa", 20);
    JTextField nameF2 = new JTextField("bbb", 20);
    JTextField nameF3 = new JTextField("ccc", 20);
    JTextField nameF4 = new JTextField("ddd", 20);
    JTextField ageF1 = new JTextField("20", 20);
    JTextField ageF2 = new JTextField("23", 20);
    JTextField ageF3 = new JTextField("19", 20);
    JTextField ageF4 = new JTextField("21", 20);
    JButton insert = new JButton("插入");
    JButton delete = new JButton("删除");
    JButton update = new JButton("修改");
    JButton search = new JButton("查询");
    JButton searchAll = new JButton("查询所有记录");
    JTextField scoreF1 = new JTextField("95", 20);
    JTextField scoreF2 = new JTextField("89", 20);
    JTextField scoreF3 = new JTextField("50", 20);
    JTextField scoreF4 = new JTextField("90", 20);
    public Gui() throws HeadlessException {
        Container container = this.getContentPane();
        container.setLayout(null);

        id.setBounds(10, 20, 40, 30);
        idf1.setBounds(60, 20, 50, 30);
        idf2.setBounds(120, 20, 50, 30);
        idf3.setBounds(180, 20, 50, 30);
        idf4.setBounds(240, 20, 50, 30);

        name.setBounds(10, 60, 40, 30);
        nameF1.setBounds(60, 60, 50, 30);
        nameF2.setBounds(120, 60, 50, 30);
        nameF3.setBounds(180, 60, 50, 30);
        nameF4.setBounds(240, 60, 50, 30);

        age.setBounds(10, 100, 40, 30);
        ageF1.setBounds(60, 100, 50, 30);
        ageF2.setBounds(120, 100, 50, 30);
        ageF3.setBounds(180, 100, 50, 30);
        ageF4.setBounds(240, 100, 50, 30);

        score.setBounds(10, 140, 40, 30);
        scoreF1.setBounds(60, 140, 50, 30);
        scoreF2.setBounds(120, 140, 50, 30);
        scoreF3.setBounds(180, 140, 50, 30);
        scoreF4.setBounds(240, 140, 50, 30);

        insert.setBounds(10, 200, 80, 30);
        delete.setBounds(110, 200, 80, 30);
        update.setBounds(210, 200, 80, 30);
        search.setBounds(310, 200, 80, 30);
        searchAll.setBounds(110, 250, 180, 30);

        add(id);add(idf1);add(idf2);add(idf3);add(idf4);
        add(name);add(nameF1);add(nameF2);add(nameF3);add(nameF4);
        add(age);add(ageF1);add(ageF2);add(ageF3);add(ageF4);
        add(score);add(scoreF1);add(scoreF2);add(scoreF3);add(scoreF4);
        add(insert);add(delete);add(update);add(search);add(searchAll);

        insert.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        search.addActionListener(this);
        searchAll.addActionListener(this);

        setLocation(400, 200);
        this.setSize(450, 350);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DAO dao = new Impl1();
        if ("插入".equals(e.getActionCommand())){
            String sql = "insert into daowork values(?,?,?,?)";
            Integer id1 = Integer.parseInt(idf1.getText());
            String name1 = nameF1.getText();
            Integer age1 = Integer.parseInt(ageF1.getText());
            Double score1 = Double.parseDouble(scoreF1.getText());
            int code1 = DBUtils.update(sql, id1, name1, age1, score1);
            System.out.println(code1);
            Integer id2 = Integer.parseInt(idf2.getText());
            String name2 = nameF2.getText();
            Integer age2 = Integer.parseInt(ageF2.getText());
            Double score2 = Double.parseDouble(scoreF2.getText());
            int code2 = DBUtils.update(sql, id2, name2, age2, score2);
            System.out.println(code2);
            Integer id3 = Integer.parseInt(idf3.getText());
            String name3 = nameF3.getText();
            Integer age3 = Integer.parseInt(ageF3.getText());
            Double score3 = Double.parseDouble(scoreF3.getText());
            int code3 = DBUtils.update(sql, id3, name3, age3, score3);
            System.out.println(code3);
            Integer id4 = Integer.parseInt(idf4.getText());
            String name4 = nameF4.getText();
            Integer age4 = Integer.parseInt(ageF4.getText());
            Double score4 = Double.parseDouble(scoreF4.getText());
            int code4 = DBUtils.update(sql, id4, name4, age4, score4);
            System.out.println(code4);
        }else if ("删除".equals(e.getActionCommand())){
            Student student = new Student();
            student.setId(Integer.parseInt(idf2.getText()));
            int code=dao.delete(student);
            System.out.println(code);
        }else if ("修改".equals(e.getActionCommand())){
            Student student = new Student();
            student.setId(Integer.parseInt(idf3.getText()));
            int code = dao.update(student);
            System.out.println(code);
        }else if ("查询".equals(e.getActionCommand())){
            List<Student> list1 = null;
            list1 = dao.getStudent(Integer.parseInt(idf1.getText()));
            new Table(list1);
        }else if ("查询所有记录".equals(e.getActionCommand())){
            List<Student> list2= null;
            list2 = dao.getAll();
            new Table(list2);
        }
    }

    public static void main(String[] args) {
        new Gui();
    }
}
