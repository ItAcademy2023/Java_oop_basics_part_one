package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;
    Review review;

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
        //throw new UnsupportedOperationException("getTotalPrice() is not implemented yet");
        int totalPrice = 0;
        for (Product product: products) {
            totalPrice += product.getPrice();
        }
        return Integer.toString(totalPrice);
    }

    public void addProduct(Product product) {
        products.add(product);
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

    public Product findProductByName(String laptop) {
        for (Product product : products) {
            if (product.getName().equals(laptop)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
