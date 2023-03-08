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
       return new Eshop("sauleshop", products);
    }

    private ArrayList<Product> createProducts() {
        ArrayList<Product>arrayList = new ArrayList<>();
        arrayList.add(new Product("shirt",78,Category.CLOTHING));
        arrayList.add(new Product("butter",2,Category.FOOD));
        arrayList.add(new Product("saule",12,Category.BOOKS));
        arrayList.add(new Product("phone",1000,Category.ELECTRONICS));
        arrayList.add(new Product("lego",99,Category.TOYS));
        arrayList.add(new Product("milk",2,Category.FOOD));
        return arrayList;

    }

}
