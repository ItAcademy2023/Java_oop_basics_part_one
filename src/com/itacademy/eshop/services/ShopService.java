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
        ArrayList<Product> products = createProducts();
        return new Eshop("name", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> arrList = new ArrayList<>();

        arrList.add(new Product("Books", 10.2, Category.BOOKS));
        arrList.add(new Product("Laptop", 999.9, Category.ELECTRONICS));
        arrList.add(new Product("Banana", 0.59, Category.FOOD));
        arrList.add(new Product("Shirt", 15, Category.CLOTHING));
        arrList.add(new Product("Toy 1", 3, Category.TOYS));
        arrList.add(new Product("Toy 2", 67, Category.TOYS));

        return arrList;
    }
}
