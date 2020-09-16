package com.java.lavaclone.study.daowork2;

import com.java.lavaclone.study.util.DBUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/22
 * @ClassName :实现类
 */

public class Impl2 implements Dao{
    @Override
    public int add(User user) {
        int code=0;
        String sql="insert into users (username,password) values(?,?)";
        code=DBUtils.update(sql,user.getName(),user.getPassword());
        return code;
    }

    @Override
    public List<User> getUser(User user) {
        String sql="select * from users where username=? and password=?";
        List<User> userlist=new ArrayList<User>();
        List<Map<String, Object>> maplist= DBUtils.query(sql, user.getName(),user.getPassword());
        for(Map<String, Object> map:maplist){
            User user1=new User();
            user1.setName((String)(map.get("username")));
            user1.setPassword((String)(map.get("password")));
            userlist.add(user1);
        }
        return userlist;
    }

    @Override
    public int add(Student2 student) {
        int code = 0;
        String sql = "insert into daowork2 value(?,?,?,?)";
        code = DBUtils.update(sql,student.getId(),student.getName(),student.getAge());
        return code;
    }

    @Override
    public List<Student2> getStudent(int id) {
        String sql="select * from daowork2 where id=?";
        List<Student2> studentArrayList=new ArrayList<>();

        List<Map<String, Object>> maplist= DBUtils.query(sql, id);
        for(Map<String, Object> map:maplist){
            Student2 student=new Student2();
            student.setId((Integer)(map.get("id")));
            student.setName((String)(map.get("name")));
            student.setAge((Integer)(map.get("age")));
            student.setScore((Integer) (map.get("score")));
            studentArrayList.add(student);
        }
        return studentArrayList;
    }

    @Override
    public List<Student2> getAll() {
        String sql="select * from daowork2";
        List<Student2> studentArrayList=new ArrayList<>();

        List<Map<String, Object>> maplist= DBUtils.query(sql);
        for(Map<String, Object> map:maplist){
            Student2 student=new Student2();
            student.setId((Integer)(map.get("id")));
            student.setName((String)(map.get("name")));
            student.setAge((Integer)(map.get("age")));
            student.setScore((Integer) (map.get("score")));
            studentArrayList.add(student);
        }
        return studentArrayList;
    }
}
