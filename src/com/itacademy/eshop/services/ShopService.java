package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;

import static com.itacademy.eshop.product.types.Category.*;

public class ShopService {
    /*** This class is used for creating new e-shop object and initializing it with some products.
     */

    public Eshop createShop() {
        /** Should create new e-shop object and initialize it with some products.
         * Should return e-shop object.
         */

       ArrayList<Product> products = createProducts();
        return new Eshop("Cool EShop", products );
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */

        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product("Cooking Book", 10, BOOKS);
        products.add(product1);

        Product product2 = new Product("Apple Watch", 100, ELECTRONICS);
        products.add(product2);

        Product product3 = new Product("Hat", 9, CLOTHING);
        products.add(product3);

        Product product4 = new Product("Coffee beans", 19.99, FOOD);
        products.add(product4);

        Product product5 = new Product("Yu-Gi-Oh cards", 5, TOYS);
        products.add(product5);

        Product product6 = new Product("Fridge", 300, ELECTRONICS);
        products.add(product6);

        return products;

    }

}
