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

       return new Eshop("Best Eshop ever", products);

        //throw new UnsupportedOperationException("createShop() is not implemented yet");
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
//        Product mauriceBook = new Product("Amazing Maurice", 12.99, Category.BOOKS);
//        Product foodApple = new Product("Apple", 2.49, Category.FOOD);
//        Product mp3Player = new Product("Ipod", 299.99, Category.ELECTRONICS);
//        Product tshirt = new Product("D&G Jacket", 599.99, Category.CLOTHING);
//        Product teddyBear = new Product("Teddy", 24.99, Category.TOYS);
//        Product foodBurger = new Product("Big Mac (TM)", 5.99, Category.FOOD);
//        Product dress = new Product("Versace Dress", 249.99, Category.TOYS);

        ArrayList<Product>productArrayList = new ArrayList<>();
        productArrayList.add(new Product("Amazing Maurice", 12.99, Category.BOOKS));
        productArrayList.add(new Product("Apple", 2.49, Category.FOOD));
        productArrayList.add(new Product("Ipod", 299.99, Category.ELECTRONICS));
        productArrayList.add(new Product("D&G Jacket", 599.99, Category.CLOTHING));
        productArrayList.add(new Product("Teddy", 24.99, Category.TOYS));
        productArrayList.add(new Product("Big Mac (TM)", 5.99, Category.FOOD));
        productArrayList.add(new Product("Fidget Spinner", 249.99, Category.TOYS));

        return productArrayList;

        //throw new UnsupportedOperationException("createProducts() is not implemented yet");
    }

}
