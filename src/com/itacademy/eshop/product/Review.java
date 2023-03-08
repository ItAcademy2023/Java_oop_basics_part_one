package com.itacademy.eshop.product;

import java.util.ArrayList;

public class Review {
    private Author author;
    private int rating;
    private String comment;

    public Review(Author author, int rating, String comment) {
        this.author = author;
        this.rating = rating;
        this.comment = comment;
    }

    public Author getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}