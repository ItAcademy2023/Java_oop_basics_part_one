package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.LocatedAt;
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
       Eshop shop = new Eshop("Name of Shop", products);
       return shop;
    }

    private ArrayList<Product> createProducts() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add( new Product("Laptop", 2000, Category.ELECTRONICS, LocatedAt.DENMARK));
        productList.add( new Product("Harry Potter", 35, Category.BOOKS, LocatedAt.DENMARK));
        productList.add( new Product("Shirt", 30, Category.CLOTHING, LocatedAt.NORWAY));
        productList.add( new Product("Burger", 5, Category.FOOD, LocatedAt.LITHUANIA));
        productList.add( new Product("Lego", 120, Category.TOYS, LocatedAt.DENMARK));
        productList.add( new Product("Bike", 1200, Category.TOYS, LocatedAt.SWEDEN));
        return productList;

        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */

    }

}
