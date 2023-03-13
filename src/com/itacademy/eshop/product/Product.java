package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

import java.time.LocalDate;
import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;
    private Description description;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.reviews = new ArrayList<>();
        this.description = new Description();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Description getDescription() {return description;}

    public void addReview(Review review) {
        reviews.add(review);
    }

    public Integer getAverageRating() {
        if (reviews.isEmpty()) {
            return null;
        }
        int rating = 0;
        for (Review review : reviews) {
            rating += review.getRating();
        }
        return rating / reviews.size();
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
