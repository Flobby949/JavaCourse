package com.java.lavaclone.study.strange;

import java.util.*;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/19
 * @ClassName :学生map类
 */

public class StudentsMap {
    private String name;
    private int id;

    public StudentsMap(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "学号："+this.id+" 姓名："+this.name;
    }

    public static void main(String[] args) {
        List<StudentsMap> studentInfomations = new ArrayList<>();
        studentInfomations.add(new StudentsMap("aaa", 1));
        studentInfomations.add(new StudentsMap("bbb", 2));
        studentInfomations.add(new StudentsMap("ccc", 3));
        studentInfomations.add(new StudentsMap("ddd", 4));
        studentInfomations.add(new StudentsMap("eee", 5));
        studentInfomations.add(new StudentsMap("fff", 6));
        List<StudentsMap> list1 = new ArrayList<>();
        List<StudentsMap> list2 = new ArrayList<>();
        Map<String, List> normal = new HashMap<>();
        Map<String, List> strong = new HashMap<>();
        for (int i = 0; i < studentInfomations.size(); i++) {
            if (i % 2 == 0) {
                list1.add(studentInfomations.get(i));
                normal.put("普通班", list1);
            } else {
                list2.add(studentInfomations.get(i));
                strong.put("强化班", list2);
            }
        }

       for (Map.Entry<String,List> entry : normal.entrySet()){
           System.out.println(entry.toString());
       }

        Iterator<Map.Entry<String, List>> entryIterator = strong.entrySet().iterator();
       while (entryIterator.hasNext()){
           Map.Entry<String,List> entry = entryIterator.next();
           System.out.println(entry.toString());
       }

    }
}

