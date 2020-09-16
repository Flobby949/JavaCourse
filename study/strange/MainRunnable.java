package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/26
 * @ClassName :
 */

public class MainRunnable extends Thread {
    static int FINAL_MAX = 100;
    @Override
    public void run() {
        for (int i = 0; i <= FINAL_MAX; i++) {
            if (i % 2 == 1) {
                System.out.println("线程一:" + i);
            }
        }
    }

    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        Thread thread1 = new Thread(childThread);
        thread1.start();
        MainRunnable mainrunnable = new MainRunnable();
        Thread thread2 = new Thread(mainrunnable);
        thread2.start();
    }
}

class ChildThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= MainRunnable.FINAL_MAX; i++) {
            if (i % 2 != 1) {
                System.out.println("线程二:" + i);
            }
        }
    }
}
