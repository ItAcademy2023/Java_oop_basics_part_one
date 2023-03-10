package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    /*** This class is used for creating new e-shop object and initializing it with some products.
     */

    public Eshop createShop() {
        /** Should create new e-shop object and initialize it with some products.
         * Should return e-shop object.
         */

        ArrayList<Product> products = createProducts();
        return new Eshop("MyShop", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("banana", 15.99, Category.FOOD));
        products.add(new Product("apple", 4.50, Category.FOOD));
        products.add(new Product("shirt", 19.99, Category.CLOTHING));
        products.add(new Product("GoT", 24.99, Category.BOOKS));
        products.add(new Product("tablet", 259.99, Category.ELECTRONICS));
        products.add(new Product("wooden horse", 99.99, Category.TOYS));

        return products;

    }

}
