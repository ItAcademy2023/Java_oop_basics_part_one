package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

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

    public String getTotalPrice() {
        /**
         * Calculates total price of shopping cart
         */
        throw new UnsupportedOperationException("getTotalPrice() is not implemented yet");
    }

    public void addProductToCart(Product product) {
        products.add(product);
    }

    public void removeProductFromCart(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                break;
            }
        }
    }

    public void writeReviewForProduct(String name, Review review) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.addReview(review);
            }
        }
    }
}