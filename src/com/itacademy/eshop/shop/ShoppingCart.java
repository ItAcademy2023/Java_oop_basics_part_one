package com.itacademy.eshop.shop;

import com.itacademy.eshop.product.Product;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product shirt) {
        products.add(shirt);
    }
    public void removeProduct(Product something){
        products.remove(something);
    }

    public Product findProductByName(String shirt) {
        for (Product product : products) {
            if (product.getName().equals(shirt)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
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
        Double sum =0.0d;
        for (Product product : products){
            sum+=product.getPrice();
        }

        return Double.toString(sum);

//        throw new UnsupportedOperationException("getTotalPrice() is not implemented yet");
    }
}
