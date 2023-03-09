package com.itacademy.eshop.product.types;

public class Author {
    private String authorName;
    private Integer age;

    public Author(String author, Integer age) {
        this.authorName = author;
        this.age = age;

    }

    public String getAuthorName() {
        return authorName;
    }

    public Integer getAge() {
        return age;
    }

}
