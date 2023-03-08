package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.LocatedAt;
import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;

    private ArrayList<RecentBuyers> recentBuyers;
    private LocatedAt country;

    public Product(String name, double price, Category category, LocatedAt country) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.country = country;
        this.reviews = new ArrayList<>();
        this.recentBuyers = new ArrayList<>();
    }
    public LocatedAt getCountry() {
        return country;
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
    public ArrayList<RecentBuyers> getRecentBuyers() {
        return recentBuyers;
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
