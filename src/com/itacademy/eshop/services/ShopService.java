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
        return new Eshop("shop", products);
    }

    private ArrayList<Product> createProducts() {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Magazines", 1.5, Category.BOOKS));
        productList.add(new Product("ToothbrushElectric", 97.5, Category.ELECTRONICS));
        productList.add(new Product("Shirt", 20, Category.CLOTHING));
        productList.add(new Product("Candy", 1.2, Category.FOOD));
        productList.add(new Product("Book", 75.5, Category.BOOKS));
        productList.add(new Product("Dress", 111.5, Category.CLOTHING));
        productList.add(new Product("toy", 15, Category.TOYS));

        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        return productList;
    }

}
