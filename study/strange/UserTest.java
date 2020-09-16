package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/3/22
 * @ClassName :测试类
 */

public class UserTest {
    public static void main(String[] args) {

        User user1 = new User("张三",12345678);
        User user2 = new User("李四",87654321);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println("      ");

        if (user1.equals(user2)){
            System.out.println(user1.name+"和"+user2.name+"是同一个用户");
        }else{
            System.out.println(user1.name+"和"+user2.name+"不是同一个用户");
        }
    }
}
