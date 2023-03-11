package com.itacademy.eshop.product;

public class Author {

    private String name;
    private int writtenBookCount;
    private int age;

    public Author(String name, int writtenBookCount, int age) {
        this.name = name;
        this.writtenBookCount = writtenBookCount;
        this.age = age;
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWrittenBookCount() {
        return writtenBookCount;
    }

    public void setWrittenBookCount(int writtenBookCount) {
        this.writtenBookCount = writtenBookCount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
