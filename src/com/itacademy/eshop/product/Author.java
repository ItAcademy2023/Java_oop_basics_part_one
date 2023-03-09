package com.itacademy.eshop.product;

public class Author {
    private String username;
    private String firstName;
    private String lastName;

    public Author(String username) {
        this.username = username;
    }

    public Author(String username, String lastName, String firstName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}