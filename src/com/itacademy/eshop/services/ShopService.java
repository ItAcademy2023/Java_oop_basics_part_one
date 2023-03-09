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
        return new Eshop("name", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Shirt", 19.99, Category.CLOTHING));
        products.add(new Product("Phone", 199.99, Category.ELECTRONICS));
        products.add(new Product("Lego", 99.99, Category.TOYS));
        products.add(new Product("Pants", 29.99, Category.CLOTHING));
        products.add(new Product("Bread", 1.99, Category.FOOD));
        products.add(new Product("Dune", 29.99, Category.BOOKS));

        return products;
    }

}
