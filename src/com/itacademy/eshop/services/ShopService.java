package com.itacademy.eshop.services;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

import java.sql.Array;
import java.util.ArrayList;

public class ShopService {
    public Eshop createShop() {
        ArrayList<Product> products = createProducts();

        return new Eshop("Test", products);
    }

    private ArrayList<Product> createProducts() {
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(new Product("Shirt", 10, Category.CLOTHING));
        arrayList.add(new Product("Coat", 15, Category.CLOTHING));
        arrayList.add(new Product("Apple", 20, Category.FOOD));
        arrayList.add(new Product("Banana", 13, Category.FOOD));
        arrayList.add(new Product("Orange", 14, Category.FOOD));
        arrayList.add(new Product("Pig", 17, Category.TOYS));
        return arrayList;
    }

}
