package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;
    //private Double sum;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void printShoppingCart() {
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory());
        }
        System.out.println("Total price: " + getTotalPrice());
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Product product : products) {
            sum = product.getPrice();
        }
        System.out.println(sum);
        return sum;
    }
    public void addProduct(Product shirt) {
        products.add(shirt);
    }
    public void removeProductByName(String laptop) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(laptop)) {
                products.remove(product);
                break;
            }
        }
    }
    public void addReview(String productName,Review review) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.addReview(review);
                break;
            }
        }
    }
}
