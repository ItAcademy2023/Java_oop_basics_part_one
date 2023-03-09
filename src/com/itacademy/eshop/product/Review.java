package com.itacademy.eshop.product;

public class Review {

    public class Author { // bonus task #4
        public String authorName;
        public String authorSurname;
        public Author(String authorName, String authorSurname){
            this.authorName = authorName;
            this.authorSurname = authorSurname;
        }
    }
    private String author;
    private int rating;
    private String comment;

    public Review(String author, int rating, String comment) {
        this.author = author;
        this.rating = rating;
        this.comment = comment;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}