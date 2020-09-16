package com.java.lavaclone.study.course;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/7
 * @ClassName :学生证
 */

public class StudentId {

    private int StudentIDNumber;

    public StudentId(int studentIDNumber) {
        StudentIDNumber = studentIDNumber;
    }

    @Override
    public String toString() {
        return "学生证号码:" + StudentIDNumber;
    }

}
