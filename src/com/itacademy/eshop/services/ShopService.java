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

        return new Eshop("name",products);
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(new Product("Shirt",123,Category.CLOTHING));
        arrayList.add(new Product("Phone",456,Category.ELECTRONICS));
        arrayList.add(new Product("Milk",2,Category.FOOD));
        arrayList.add(new Product("The Shining",45,Category.BOOKS));
        arrayList.add(new Product("Truck",123,Category.TOYS));
        arrayList.add(new Product("Computer mouse",23,Category.ELECTRONICS));


        return arrayList;
    }

}
