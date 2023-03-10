package com.itacademy.eshop.product;

public class Author {
    private String authorName;
    private String authorSurname;
    private int age;

    public Author(String authorName, String authorSurname, int age) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.age = age;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public int getAge() {
        return age;
    }
}
