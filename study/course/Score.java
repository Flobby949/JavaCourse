package com.java.lavaclone.study.course;

/**
 * @author Flobby
 * @version 1.0
 * @date 2019.12.05
 * @ClassName 学生成绩
 */
public class Score {

    public float java;
    public float c;
    public float python;

    private Float sum() {

        return (this.java + this.c + this.python);
    }

    private Float average() {
        return (this.java + this.c + this.python) / 3;
    }

    public void showScoreSum() {
        System.out.println("总分" + sum());

    }

    public void showScoreAverage() {
        System.out.println("平均分" + average());
    }

}
