package com.java.lavaclone.study.daowork2;



import java.util.List;

/**
 * @author Flobby
 */

public interface Dao {
    int add(User user);
    List<User> getUser(User user);
    int add(Student2 student);
    List<Student2> getStudent(int student);
    List<Student2> getAll();
}
