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
        String name = "Walmart";
        ArrayList<Product> products = createProducts();

        Eshop eShop = new Eshop(name, products);
        if(eShop.)
        return eShop;

//        throw new UnsupportedOperationException("createShop() is not implemented yet");
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
            ArrayList<Product> products = new ArrayList<Product> ();

            products.add(new Product("Vanilla CSS", 654.99, Category.DIY));
            products.add(new Product("MacBook M1 13", 1254.99, Category.ELECTRONICS));
            products.add(new Product("Lego toy car", 12.54, Category.TOYS));
            products.add(new Product("The C Programming language", 999.99, Category.BOOKS));
            products.add(new Product("Tabi Boot MM6", 700.12, Category.CLOTHING));
            products.add(new Product("Mcd big mac", 3.49, Category.FOOD));

            if(products.isEmpty()){
                throw new UnsupportedOperationException("createProducts() is not implemented yet");
            }
            return products;

    }

}
