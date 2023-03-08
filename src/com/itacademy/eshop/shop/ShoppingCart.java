package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void printShoppingCart() {
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory());
        }
        System.out.println("Total price: " + getTotalPrice());
    }

    public double getTotalPrice() {
        /**
         * Calculates total price of shopping cart
         */
        int index;
        int sum = 0;
        for (index = 0; index < products.size(); index++)
        {
            sum += products.get(index).getPrice();
        }
        return sum;
    }
    public void AddItem(Product itemToAdd){
        products.add(itemToAdd);
    }
    public void RemoveItem(Product itemToRemove){
        products.remove(itemToRemove);
    }
}
