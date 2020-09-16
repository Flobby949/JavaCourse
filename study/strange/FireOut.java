package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 */
public interface FireOut {
    void boom();
}

class Fireworks {
    public static void main(String[] args) {
        new FireOut() {
            @Override
            public void boom() {
                System.out.println("红色烟花80响");
            }
        }.boom();

        new FireOut() {
            @Override
            public void boom(){
                System.out.println("黄色烟花100响");
            }
        }.boom();
    }
}