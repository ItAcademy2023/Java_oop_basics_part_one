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
       return new Eshop ("name", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(new Product("shirt", 70, Category.CLOTHING));
        arrayList.add(new Product("Hello World", 12, Category.BOOKS ));
        arrayList.add(new Product("Laptop", 1099, Category.ELECTRONICS ));
        arrayList.add(new Product("Apples", 2.50, Category.FOOD ));
        arrayList.add(new Product("Doll", 4.99, Category.TOYS ));
        arrayList.add(new Product("Pineapple", 1.50, Category.FOOD ));
        return arrayList;
    }

}
