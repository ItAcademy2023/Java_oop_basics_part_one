package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product shirt) {
        products.add(shirt);
    }

    public ArrayList<Product> getProducts() {
        return products;
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
    public void printShoppingCart() {
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory());
        }
        System.out.println("Total price: " + getTotalPrice());
    }

    public Double getTotalPrice() {
        /**
         * Cakculates total price of shopping cart
         */
        double totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
           totalPrice += products.get(i).getPrice();
        }
        return totalPrice;
    }
}
