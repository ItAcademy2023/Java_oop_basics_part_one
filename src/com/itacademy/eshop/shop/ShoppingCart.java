package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;
    private Product shirt;

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
        double totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice();
        }
        return "" + totalPrice;

        /**
         * Calculates total price of shopping cart
         */
    }
    public void addProduct(Product shirt) { products.add(shirt);}
    public void removeProduct(Product shirt) { products.remove(shirt);}


}
