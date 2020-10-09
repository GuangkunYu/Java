package com.anli;

public class Student {
    String name;
    String id;
    String address;
    private int age;

    public Student() {
    }

    public Student(String name, String id, String address, int age) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
