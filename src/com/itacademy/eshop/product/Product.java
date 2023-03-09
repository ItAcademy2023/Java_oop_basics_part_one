package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.Manufacturer;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private Manufacturer manufacturer;
    private ArrayList<Review> reviews;
    private ArrayList<Order> orders;

    public Product(String name, double price, Category category, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.manufacturer = manufacturer;
        this.reviews = new ArrayList<>();
        this.orders = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    private ArrayList<Order> getOrders() {
        return orders;
    }
    public Category getCategory() {
        return category;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
    private void addOrder(Order order) {
        orders.add(order);
    }
    public Double getAverageRating() {
        if (reviews.isEmpty()) {
            return null;
        }
        double rating = 0;
        for (Review review : reviews) {
            rating += review.getRating();
        }
        return rating / reviews.size();
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
