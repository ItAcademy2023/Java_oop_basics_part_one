package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Discount;
import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.State;
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
        return new Eshop("Rut-shop", products);   // returning in a single line
    }

    private ArrayList<Product> createProducts() {

        ArrayList<Product> products = new ArrayList<>();

               products.add(new Product("Butter", 5.5, Category.FOOD, State.NO_DEFECTS));
               products.add(new Product("Dress", 15, Category.CLOTHING, State.WITH_DEFECTS));
               products.add(new Product("Computer", 1500, Category.ELECTRONICS, State.NO_DEFECTS));
               products.add(new Product("Doll-house", 25.6, Category.TOYS, State.WITH_DEFECTS));
               products.add(new Product("HarryPotter", 14.89, Category.BOOKS, State.NO_DEFECTS));
               products.add(new Product("Milk", 4.2, Category.FOOD, State.UNUSABLE));

               return products;
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
    }

}
