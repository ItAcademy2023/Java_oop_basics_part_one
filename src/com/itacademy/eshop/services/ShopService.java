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
        return new Eshop("Rut-shop", products);   // returning in a single line
    }

    private ArrayList<Product> createProducts() {

        ArrayList<Product> arrayList = new ArrayList<>();

               arrayList.add(new Product("Butter", 5.5, Category.FOOD));
               arrayList.add(new Product("Dress", 15, Category.CLOTHING));
               arrayList.add(new Product("Computer", 1500, Category.ELECTRONICS));
               arrayList.add(new Product("Doll-house", 25.6, Category.TOYS));
               arrayList.add(new Product("HarryPotter", 14.89, Category.BOOKS));
               arrayList.add(new Product("Milk", 4.2, Category.FOOD));

               return arrayList;
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
    }

}
