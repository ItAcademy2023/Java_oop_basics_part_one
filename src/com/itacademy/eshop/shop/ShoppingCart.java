package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addToShopingCart(Product shirt) {
        products.add(shirt);
    }
    public void removeFromShopingCart(String laptop) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(laptop)) {
                products.remove(product);
                break;
            }
        }
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
        double total=0.0;
        for (int i = 0; i < products.size(); i++) {
            total+=products.get(i).getPrice();

        }
        return total;
    }
}
