package com.java.lavaclone.study.daowork1;

import java.util.List;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/20
 * @ClassName :
 */

public interface DAO {
    int add(Student student);
    int delete(Student student);
    int update(Student student);
    List<Student> getStudent(int student);
    List<Student> getAll();
}
