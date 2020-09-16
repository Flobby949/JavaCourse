package com.java.lavaclone.study.manythread;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/31
 * @ClassName :
 */

public class TestWindow {
    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("一号窗口");
        t2.setName("二号窗口");
        t3.setName("三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Window1 implements Runnable{
    int ticket = 40;
    Object obj = new Object();
    @Override
    public void run() {
        while(true) {
            synchronized(obj) {
                if(ticket > 0) {
                    try {
                        Thread.sleep(75);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "挂号为："+ ticket-- +"号");
                }
            }
        }
    }
}

