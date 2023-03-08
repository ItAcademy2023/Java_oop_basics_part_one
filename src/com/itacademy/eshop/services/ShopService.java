package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

import java.awt.*;
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

//        throw new UnsupportedOperationException("createShop() is not implemented yet");

        Eshop eshop = new Eshop("Buy stuff", products);

        return eshop;
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
//        throw new UnsupportedOperationException("createProducts() is not implemented yet");

        ArrayList<Product> arrayList = new ArrayList<>();

        arrayList.add(new Product("dictionary", 5.6, Category.BOOKS));
        arrayList.add(new Product("cucumber", 9.88, FOOD));
        arrayList.add(new Product("lego", 36.3, TOYS));
        arrayList.add(new Product("phone", 600.67, ELECTRONICS));
        arrayList.add(new Product("t-shirt", 15.6, CLOTHING));
        arrayList.add(new Product("detective club", 14.67, BOOKS));

        return arrayList;
    }

}
