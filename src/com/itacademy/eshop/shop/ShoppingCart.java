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

    public String getTotalPrice() {
        /**
         * Cakculates total price of shopping cart
         */
        throw new UnsupportedOperationException("getTotalPrice() is not implemented yet");
    }

    public void addProduct(Product someProduct) {
        products.add(someProduct);
    }

    public void removeProductByName(String someProduct) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(someProduct)) {
                products.remove(product);
                break;
            }
        }
    }
}
