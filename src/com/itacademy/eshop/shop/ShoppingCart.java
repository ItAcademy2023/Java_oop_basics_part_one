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
//        System.out.println("Total price: " + getTotalPrice());
    }
    public void addProductToShoppingCart(Product shirt) {
        products.add(shirt);
    }

    public void removeProductByNameShoppingCart(String laptop) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(laptop)) {
                products.remove(product);
                break;
            }
        }
    }

    public Product findProductByNameShoppingCart(String shirt) {
        for (Product product : products) {
            if (product.getName().equals(shirt)) {
                return product;
            }
        }
        return null;
    }

    public void addReview(String productName, Review review) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.addReview(review);
                break;
            }
        }
    }




    public void getTotalPrice() {
        /**
         * Cakculates total price of shopping cart
         */
        return ;

    }
}
