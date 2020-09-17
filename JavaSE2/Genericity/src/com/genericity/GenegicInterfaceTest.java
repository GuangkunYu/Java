package com.genericity;

public class GenegicInterfaceTest {
    public static void main(String[] args) {
        GenegicInterface<String> gi = new GenegicImpl<>();
        gi.show("林青霞");

        GenegicInterface<Integer> gii = new GenegicImpl<>();
        gii.show(20);
    }
}
