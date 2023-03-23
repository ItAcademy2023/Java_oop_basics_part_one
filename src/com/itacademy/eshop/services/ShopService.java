package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;

public class ShopService {
    /*** This class is used for creating new e-shop object and initializing it with some products.
     */

    public Eshop createShop() {

        /** Should create new e-shop object and initialize it with some products.
         * Should return e-shop object.
         */
       return new Eshop ("name", createProducts());
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("shirt", 70, Category.CLOTHING));
        products.add(new Product("Hello World", 12, Category.BOOKS ));
        products.add(new Product("Laptop", 1099, Category.ELECTRONICS ));
        products.add(new Product("Apples", 2.50, Category.FOOD ));
        products.add(new Product("Doll", 4.99, Category.TOYS ));
       products.add(new Product("Pineapple", 1.50, Category.FOOD ));
        return products;
    }

}
