package com.java.lavaclone.study.course;

/**
 * @author Flobby
 * @date :2019/12/19
 * @ClassName :客户类
 * @version: :1.0
 */

public class Client {
    String[] names = new String[30];
    public void addName(String name){

       for(int i = 0;i <names.length;i++){
           if(names[i] == null){
               names[i] = name;
               break;

           }
       }
    }
    public void showName(){
        System.out.println("***********");
        System.out.println("客户列表");
        System.out.println("***********");
        for(int i = 0;i<names.length;i++) {
            if (names[i] == null) {
                System.out.println(names[i] + "");
            }
        }
        System.out.println("");
    }
}
