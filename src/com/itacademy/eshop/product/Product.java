package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Availability;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.ShippingType;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private ArrayList<Review> reviews;
    private ShippingOption shippingOption;
    private Availability availability;


    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.reviews = new ArrayList<>();
        this.shippingOption = new ShippingOption(ShippingType.FREE);
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

    public void setPrice(double price) {
        this.price = price;
    }

    public ShippingOption getShippingOption() {
        return shippingOption;
    }

    public void setShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption;
    }

    private double calculateTotalPrice() {
        double totalPrice = price;
        if (availability == Availability.IN_STOCK) {
            totalPrice += shippingOption.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPrice() {
        return calculateTotalPrice();
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }
}
