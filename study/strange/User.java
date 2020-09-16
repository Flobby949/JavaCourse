package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/20
 * @ClassName :用户类
 */

public class User {
    public String name;
    public int phoneNumber;
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return phoneNumber == user.phoneNumber;
    }
    public User(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "姓名=" + name + ", 电话号=" + phoneNumber;
    }
}