package com.java.lavaclone.study.strange;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/5/27
 * @ClassName :
 */

public class ThreadWork extends Thread{
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
        ThreadWork threadWork = new ThreadWork();
        Thread thread1 = new Thread(threadWork);
        thread1.start();
        ChildThreadWork childThreadWork = new ChildThreadWork();
        Thread thread2 = new Thread(childThreadWork);
        thread2.start();
    }
}

class ChildThreadWork extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= ThreadWork.FINAL_MAX; i++) {
            if (i % 2 != 1) {
                System.out.println("线程二:" + i);
            }
        }
    }
}
