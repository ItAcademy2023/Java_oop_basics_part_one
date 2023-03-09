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
    public void addProductToCart(Product product){
        products.add(product);
    }
    public void removeProductByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(name)) {
                products.remove(product);
                break;
            }
        }
    }
    public ArrayList<Product> getShoppingCartProducts(){
        if(!products.isEmpty()){
            return products;
        } else {
            throw new UnsupportedOperationException("Shopping cart is empty");
        }
    }

    public Product findProductByName(String shirt) {
        if(products.isEmpty()){
            throw new UnsupportedOperationException("Shopping cart is empty");
        } else{
            for (Product product : products) {
                if (product.getName().equals(shirt)) {
                    return product;
                }
            }
            return null;
        }

    }
    public String getTotalPrice() {
        /**
         * Calculates total price of shopping cart
         */
        double sum = 0;
        if(products.isEmpty()){
            throw new UnsupportedOperationException("Shopping cart is empty");
        } else{
            for (Product product: products){
                sum += product.getPrice();
            }
        }

        return "The total price is: " + sum;
    }
}
