package com.itacademy.eshop.product;

public class Review {
    private Author author;
    private int rating;
    private String comment;

    public Review(Author author, int rating, String comment) {
        this.author = author;
        this.rating = rating;
        this.comment = comment;
    }

    public String getAuthor() {
        return author.getName();
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}