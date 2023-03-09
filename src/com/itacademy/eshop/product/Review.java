package com.itacademy.eshop.product;

public class Review {

    private class Author { // bonus task #4
        public String authorName;
        public String authorSurname;
        public Author(String authorName, String authorSurname){
            this.authorName = authorName;
            this.authorSurname = authorSurname;
        }
    }
    private Author authorObj;
    private String author;
    private int rating;
    private String comment;

    public void setAuthor(String authorName, String authorSurname){
        authorObj = new Author(authorName, authorSurname);
    }

    public Review(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public Review(String authorName, String authorSurname, int rating, String comment) {
        this.rating = rating;
        this.authorObj = new Author(authorName, authorSurname);
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