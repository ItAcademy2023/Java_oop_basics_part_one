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
        for (int i = 0; i < products.size(); i++) {
            sum += products.get(i).getPrice();
        }
        return String.valueOf(sum);
    }

    public void addProductToShoppingCart(Product thing) {
        products.add(thing);
    }

    public void removeProductByName(String thing) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(thing)) {
                products.remove(product);
                break;
            }
        }
    }

    public Product findProductByName(String thing) {
        for (Product product : products) {
            if (product.getName().equals(thing)) {
                return product;
            }
        }
        return null;
    }
}
