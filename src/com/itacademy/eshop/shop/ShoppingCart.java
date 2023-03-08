package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }


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

    public void addProduct(Product shirt) {
        products.add(shirt);
    }

    public void removeProduct(Product shirt){
        products.remove(shirt);
    }

    public Product findProductByName(String shirt) {
        for (Product product : products) {
            if (product.getName().equals(shirt)) {
                return product;
            }
        }
        return null;
    }

    public Double getTotalPrice() {
        /**
         * Cakculates total price of shopping cart
         */
//        throw new UnsupportedOperationException("getTotalPrice() is not implemented yet");

        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
