package com.java.lavaclone.study.strange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/12
 * @ClassName ：企鹅list类
 */

public class Penguin{
    String name;
    int age;

    public Penguin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+"已经"+age+"岁了";
    }

    public static void main(String[] args) {
        List<Penguin> penguins = new ArrayList<>();
        penguins.add(new Penguin("Skipper",10));
        penguins.add(new Penguin("Kowalski",10));
        penguins.add(new Penguin("Rico",10));
        penguins.add(new Penguin("Private",10));
        penguins.remove(0);

        Iterator<Penguin> iterator = penguins.iterator();
        while (iterator.hasNext()){
            Penguin penguin = iterator.next();
            System.out.println(penguin.toString());
        }
    }
}
