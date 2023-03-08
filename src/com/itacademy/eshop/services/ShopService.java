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
        return new Eshop("Lol", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> myList = new ArrayList<>();
        Product product1 = new Product("Harry Potter and the Philosopher's Stone", 15, Category.BOOKS);
        Product product2 = new Product("Samsung laptop", 700, Category.ELECTRONICS);
        Product product3 = new Product("Yellow shirt", 10, Category.CLOTHING);
        Product product4 = new Product("Hot dog", 3, Category.FOOD);
        Product product5 = new Product("Toy car", 12, Category.TOYS);
        Product product6 = new Product("Nail polish", 7, Category.MISC);

        myList.add(product1);
        myList.add(product2);
        myList.add(product3);
        myList.add(product4);
        myList.add(product5);
        myList.add(product6);

        return myList;
    }

}
