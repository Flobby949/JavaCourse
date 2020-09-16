package com.java.lavaclone.study.strange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/14
 * @ClassName :hashmap
 */

public class SearchStudents{
    private String name;
    private String sex;
    private int age;

    public SearchStudents(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名："+this.name+"  性别："+this.sex+"  年龄："+this.age;
    }

    public static void main(String[] args) {
        Map<String,SearchStudents> student = new HashMap<>();
        student.put("1",new SearchStudents("aaa","male",18));
        student.put("2",new SearchStudents("bbb","female",19));
        student.put("3",new SearchStudents("ccc","male",20));
        student.put("4",new SearchStudents("ddd","female",21));


        if (student.containsKey("2")){
            System.out.println("2号存在\n"+student.get("2"));
        }else{
            System.out.println("不存在");
        }

        for (Map.Entry<String, SearchStudents> entry : student.entrySet()) {
            System.out.println(entry.toString());
        }

    }
}
