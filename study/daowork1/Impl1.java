package com.java.lavaclone.study.daowork1;

import com.java.lavaclone.study.util.DBUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/20
 * @ClassName :重写接口方法
 */

public class Impl1 implements DAO{

    @Override
    public int add(Student student) {
        int code = 0;
        String sql = "insert into daowork value(?,?,?,?)";
        code = DBUtils.update(sql,student.getId(),student.getName(),student.getAge(),student.getScore());
        return code;
    }

    @Override
    public int delete(Student student) {
        int code = 0;
        String sql="delete from daowork where id=?";
        code=DBUtils.update(sql, student.getId());
        return code;
    }

    @Override
    public int update(Student student) {
        int code = 0;
        String sql = "update daowork set score=100 where id=?";
        code = DBUtils.update(sql,student.getId());
        return code;
    }

    @Override
    public List<Student> getStudent(int id) {
        String sql="select * from daowork where id=?";
        List<Student> studentArrayList=new ArrayList<Student>();

        List<Map<String, Object>> maplist= DBUtils.query(sql, id);
        for(Map<String, Object> map:maplist){
            Student student=new Student();
            student.setId((Integer)(map.get("id")));
            student.setName((String)(map.get("name")));
            student.setAge((Integer)(map.get("age")));
            student.setScore((Integer) (map.get("score")));
            studentArrayList.add(student);
        }
        return studentArrayList;
    }

    @Override
    public List<Student> getAll() {
        String sql="select * from daowork";
        List<Student> studentArrayList=new ArrayList<Student>();

        List<Map<String, Object>> maplist= DBUtils.query(sql);
        for(Map<String, Object> map:maplist){
            Student student=new Student();
            student.setId((Integer)(map.get("id")));
            student.setName((String)(map.get("name")));
            student.setAge((Integer)(map.get("age")));
            student.setScore((Integer) (map.get("score")));
            studentArrayList.add(student);
        }
        return studentArrayList;
    }
}
