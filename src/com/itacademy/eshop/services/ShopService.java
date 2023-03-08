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
       return new Eshop("coolest shop around the block boyo", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("banana phone", 6.99, Category.ELECTRONICS));
        products.add(new Product("singular banana", 9.99, Category.FOOD));
        products.add(new Product("plushy banana", 49.99, Category.TOYS));
        products.add(new Product("guide to growing bananas", 0.99, Category.BOOKS));
        products.add(new Product("shirt made of bananas", 999.99, Category.CLOTHING));
        products.add(new Product("banana encyclopedia", 10.99, Category.BOOKS));

        return products;
    }

}
