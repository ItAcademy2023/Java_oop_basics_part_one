package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;

public class Product {

    private class innerProductClass{ // bonus task #1

    }

    public enum newEnum{ // bonus task #3
        ManufacturerNumber1,
        ManufacturerNumber2
    }

    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
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
    private void privateMethod(){ // bonus task #2
        System.out.println("Private method called!");
    }
    public void methodToCallPrivateMethod(){
        privateMethod();
    }
}
