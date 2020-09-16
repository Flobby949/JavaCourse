package com.java.lavaclone.study.test;

import com.java.lavaclone.study.course.Id;
import com.java.lavaclone.study.course.StudentId;
import com.java.lavaclone.study.course.Students;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/7
 * @ClassName :泛型类测试
 */

public class StudentsTest {
    public static void main(String[] args) {
        System.out.println("打印学生身份证明：");
        Id id = new Id(12345678);
        Students students1 = new Students<>();
        students1.setLogo(id);
        System.out.println("\t"+students1.getLogo());

        StudentId studentId = new StudentId(87654321);
        Students student2 = new Students();
        student2.setLogo(studentId);
        System.out.println("\t"+student2.getLogo());
    }
}
