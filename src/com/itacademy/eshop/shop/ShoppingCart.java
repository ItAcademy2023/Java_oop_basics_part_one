package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;

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
         * Cakculates total price of shopping cart
         */
        double sum = 0;

        for (Product product: this.products) {
            sum += product.getPrice();
        }
        return String.valueOf(sum);
    }

    public void addProduct (Product product) {
        this.products.add(product);
    }

    public void removeProduct (Product product) {
        this.products.remove(product);
    }
}
