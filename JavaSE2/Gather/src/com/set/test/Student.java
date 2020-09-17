package com.set.test;

public class Student {
    private String name;
    private int yuScore;
    private int shuScore;

    public Student() {
    }

    public Student(String name, int yuScore, int shuScore) {
        this.name = name;
        this.yuScore = yuScore;
        this.shuScore = shuScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYuScore() {
        return yuScore;
    }

    public void setYuScore(int yuScore) {
        this.yuScore = yuScore;
    }

    public int getShuScore() {
        return shuScore;
    }

    public void setShuScore(int shuScore) {
        this.shuScore = shuScore;
    }


}
