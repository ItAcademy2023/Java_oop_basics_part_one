package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopService {
    /*** This class is used for creating new e-shop object and initializing it with some products.
     */

    public Eshop createShop() {
        /** Should create new e-shop object and initialize it with some products.
         * Should return e-shop object.
         */
try {
    System.out.println("Enter your shop name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    ArrayList<Product> products = createProducts();

    Eshop eshop = new Eshop(name, products);
    return eshop;
}
catch (UnsupportedOperationException e) {
    throw new UnsupportedOperationException("createShop() is not implemented yet");
}
    }

    private ArrayList<Product> createProducts() {
        /**
         * Should return a list of products. Should contain at least 6 products,
         * one per each category in Category enum.
         * Product should not have any reviews.
         */
        try {
            ArrayList<Product> productList = new ArrayList<>();
            Product product = new Product("Dell Laptop", 800.0d, Category.ELECTRONICS);
            productList.add(product);
            Product product1 = new Product("Lord of The Rings", 20.0d, Category.BOOKS);
            productList.add(product1);
            Product product2 = new Product("Lego Bricks", 35.0d, Category.TOYS);
            productList.add(product2);
            Product product3 = new Product("Red Shirt", 15.0d, Category.CLOTHING);
            productList.add(product3);
            Product product4 = new Product("Cookies", 5.0d, Category.FOOD);
            productList.add(product4);
            Product product5 = new Product("Asus Laptop", 1000.0d, Category.ELECTRONICS);
            return productList;

        }
        catch(UnsupportedOperationException e){
            throw new UnsupportedOperationException("createProducts() is not implemented yet");
        }
    }

}
