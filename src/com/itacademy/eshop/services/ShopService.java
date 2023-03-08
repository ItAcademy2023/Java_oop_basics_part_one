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
        return new Eshop("MyShop", products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(new Product("Shirt", 78.50, Category.CLOTHING));
        arrayList.add(new Product("Pants", 56.40, Category.CLOTHING));
        arrayList.add(new Product("Pizza", 10, Category.FOOD));
        arrayList.add(new Product("Phone", 800, Category.ELECTRONICS));
        arrayList.add(new Product("Apple", 3.2, Category.FOOD));
        arrayList.add(new Product("TV", 550, Category.ELECTRONICS));
        arrayList.add(new Product("SomeBook", 15, Category.BOOKS));

        return arrayList;

    }

}
