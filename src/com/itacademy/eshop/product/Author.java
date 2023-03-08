package com.itacademy.eshop.product;

public class Author {
    private String name;
    private int age;
    private String country;

    public Author(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
