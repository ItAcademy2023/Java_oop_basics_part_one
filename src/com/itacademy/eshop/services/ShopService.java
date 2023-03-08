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
        Eshop demoShop = new Eshop("Shopas", products);

        return demoShop;
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        Product sciFiBook = new Product("Harry Potter", 19.99, Category.BOOKS);
        Product laptop = new Product("Lenovo", 1999.99, Category.ELECTRONICS);
        Product shirt = new Product("Supreme", 199.99, Category.CLOTHING);
        Product banana = new Product("Banana", 0.99, Category.FOOD);
        Product lego = new Product("Lego", 39.99, Category.TOYS);
        Product pc = new Product("HP", 739.99, Category.ELECTRONICS);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(sciFiBook);
        products.add(laptop);
        products.add(shirt);
        products.add(banana);
        products.add(lego);
        products.add(pc);

        return products;
    }

}
