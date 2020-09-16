package com.java.lavaclone.study.course;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/7
 * @ClassName :泛型类
 */

public class Students<E>{
    private E Logo;

    public E getLogo() {
        return Logo;
    }
    public void setLogo(E logo) {
        Logo = logo;
    }
}

