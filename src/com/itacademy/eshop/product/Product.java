package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.State;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;
    private ArrayList<Discount> discounts;
    private State state;

    public Product(String name, double price, Category category, State state) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.reviews = new ArrayList<>();
        this.discounts = new ArrayList<>();
        this.state = state;
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

    public ArrayList<Discount> getDiscounts() {
        return discounts;
    }

    public State getState() {
        return state;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
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

    private double getAverageDiscount() {
        if (discounts.isEmpty()) {
            return 0;
        }
        double discountSize = 0;
        for (Discount d : discounts) {
            discountSize += d.getSize();
        }
        return discountSize / discounts.size();
    }

    public double averageDiscount() {
        return this.getAverageDiscount();
    }
}
