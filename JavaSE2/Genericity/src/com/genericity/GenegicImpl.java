package com.genericity;

public class GenegicImpl<T> implements GenegicInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
