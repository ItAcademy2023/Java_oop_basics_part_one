package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.Material;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private Category category;
    private Material material;
    private ArrayList<Review> reviews;
    private Information info;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.reviews = new ArrayList<>();
        this.info = new Information();
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
        addInfo("wow", "2000-01-01");
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
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

    private void addInfo(String manufacturer, String publishDate) {
        info.setManufacturer(manufacturer);
        info.setPublishDate(publishDate);
    }

}
