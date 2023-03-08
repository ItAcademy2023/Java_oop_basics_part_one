package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.product.types.Category;

import java.util.ArrayList;

public class Eshop {
    private String name;
    private ArrayList<Product> products;

    public Eshop(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Reviews:");
            for (Review review : product.getReviews()) {
                System.out.println("Author: " + review.getAuthor());
                System.out.println("Rating: " + review.getRating());
                System.out.println("Comment: " + review.getComment());
            }
            System.out.println("Average rating: " + product.getAverageRating());
            System.out.println("-----------------------------");
        }
    }

    public void addProduct(Product shirt) {
        products.add(shirt);
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


    public void changePriceForProduct(String productName, int price) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.setPrice(price);
                break;
            }
        }
    }

    public void removeProductByCategory(Category category) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getCategory().equals(category)) {
                products.remove(i);
                break;
            }
        }
    }

    public Product findProductByName(String shirt) {
        for (Product product : products) {
            if (product.getName().equals(shirt)) {
                return product;
            }
        }
        return null;
    }



}
