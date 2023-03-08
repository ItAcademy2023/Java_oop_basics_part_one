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
        return new Eshop("audriusShop", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */


        return new ArrayList<>(List.of(
                new Product("Bike", 550, Category.TOYS),
                new Product("Sweater", 52, Category.CLOTHING),
                new Product("Apple", 3, Category.FOOD),
                new Product("Jeans", 80, Category.CLOTHING),
                new Product("Football", 60, Category.TOYS),
                new Product("Shirt", 45, Category.CLOTHING)

        ));
    }
}
