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

        return new Eshop("Fantazijos", createProducts());
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Crime and Punishment", 15, Category.BOOKS));
        productList.add(new Product("TV", 1000, Category.ELECTRONICS));
        productList.add(new Product("Supreme Hoodie", 1001, Category.CLOTHING));
        productList.add(new Product("Big Mac", 5, Category.FOOD));
        productList.add(new Product("Fidget Spinner", 8, Category.TOYS));
        productList.add(new Product("Jeans", 12, Category.CLOTHING));
        productList.add(new Product("Peppers", 1, Category.MISC));
        return productList;
    }

}
