package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.simulations.ManagerSimulation;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products;

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

    public void addProductToCart(Product product) {
        products.add(product);
    }

    public void removeProductByName(String productName) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(productName)) {
                products.remove(product);
                break;
            }
        }
    }

    public String getTotalPrice() {
        /**
         * Cakculates total price of shopping cart
         */
        throw new UnsupportedOperationException("getTotalPrice() is not implemented yet");
    }
}
