package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.Stock;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private Stock stock;

    private ArrayList<Review> reviews;

    public Product(String name, double price, Category category, Stock stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;

        this.reviews = new ArrayList<>();

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
