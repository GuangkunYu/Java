package com.exception;

public class Teacher {
    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
//            throw new CustomException();
            throw new CustomException("你输入的分数异常，应该在0~100之间");
        } else {
            System.out.println("分数正常");
        }
    }
}
