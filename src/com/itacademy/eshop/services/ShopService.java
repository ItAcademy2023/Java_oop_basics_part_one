package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
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
        Eshop eshop = new Eshop("name", products);
        return eshop;
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */

        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(new Product("Dress",20,Category.CLOTHING));
        arrayList.add(new Product("Burger",2,Category.FOOD));
        arrayList.add(new Product("Success book",4,Category.BOOKS));
        arrayList.add(new Product("Dell computer",400,Category.ELECTRONICS));
        arrayList.add(new Product("Teddy bear",1.2,Category.TOYS));

        return arrayList;

    }

}
