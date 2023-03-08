package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.AmountInStock;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.OriginCountry;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;

    private AmountInStock amountInStock;

    private OriginCountry originCountry;



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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public AmountInStock getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(AmountInStock amountInStock) {
        this.amountInStock = amountInStock;
    }

    public OriginCountry getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(OriginCountry originCountry) {
        this.originCountry = originCountry;
    }

    public Integer getAverageRating() {
        if (reviews.isEmpty()) {
            return null;
        }

        bonusTaskPrivateMethod();

        int rating = 0;
        for (Review review : reviews) {
            rating += review.getRating();
        }
        return rating / reviews.size();

    }

    public void setPrice(int price) {
        this.price = price;
    }

    private void bonusTaskPrivateMethod() {
        System.out.println("It works");
    }

}
