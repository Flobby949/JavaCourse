package com.java.lavaclone.study.course;

/**
 * @author Flobby
 * @version 1.0
 * @date 2019.12.05
 * @ClassName 手机
 */
public class MobilePhone {

   public static void playMusic(){
       // 播放音乐
       System.out.println("手机正在播放音乐");

   }

   public static String downloadMusic(){
       // 下载音乐
       String songname = "intro";
       System.out.println("手机正在下载"+songname);
       return songname;
   }



   public static void charge(){
       //充电
       Battery battery = new Battery();

       battery.brand = "Apple";

       battery.getPower();
   }

}
