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
        /***
         * inserted code during the lecture practice exercise
         */
       return new Eshop("name",products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */


        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(new Product("Shirt", 24, Category.CLOTHING));
        arrayList.add(new Product("Edward Haven", 4, Category.BOOKS));
        arrayList.add(new Product("Jam", 14, Category.FOOD));
        arrayList.add(new Product("Buzz Lightyear", 94, Category.TOYS));
        arrayList.add(new Product("Dryer", 102, Category.ELECTRONICS));
        arrayList.add(new Product("Shirt", 25, Category.CLOTHING));

        arrayList.add(new Product("Cameroon",237, Category.NATIONALITY));
            return arrayList;

    }

}
