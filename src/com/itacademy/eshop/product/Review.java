package com.itacademy.eshop.product;

public class Review {
    private Author author;
    private int rating;
    private String comment;

    public Review(String authorName, String authorSurname, int rating, String comment) {
        this.author = new Author(authorName, authorSurname);
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