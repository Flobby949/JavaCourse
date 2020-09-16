package com.java.lavaclone.study.strange;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/7
 * @ClassName :泛型方法
 */

public class NormalClass {
    public static < E > E getTheSecondLastElement(E[] array){
        return array[array.length-2];
    }
    public static void main(String[] args) {
        Integer[] intArray = {10,15,20,25,30,35,40};
        System.out.println(getTheSecondLastElement(intArray));
    }
}

