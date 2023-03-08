package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;

import java.util.ArrayList;
import java.util.UUID;

/**
 * This class represents a simulation of a customer shopping on an Eshop.
 * The customer can add and remove products from their shopping cart,
 * as well as leave reviews and ratings for the products.
 */
public class CustomerSimulation {
    private Eshop shop;
    private ShoppingCart shoppingCart;

    public CustomerSimulation(Eshop shop) {
        this.shop = shop;
        shoppingCart = new ShoppingCart();
    }

    public ShoppingCart simulateCustomerShopping() {
        addProductsToShoppingCart();
        removeProductsFromShoppingCart();
        leaveReviewsAndRatingsForProducts();
        return shoppingCart;
    }

    private void addProductsToShoppingCart() {
        /**
         * User browses the shop and adds 4 products to the shopping cart.
         * One of them should be a book and other should be a shirt.
         */
        ArrayList<Product> products = new ArrayList<>();
        String[] customerProductNames = {"Shirt", "Book", "The C Programming language", "Vanilla CSS"};


        for (String name: customerProductNames){
            products.add(shop.findProductByName(name));
        }

        if (products.isEmpty()){
            throw new UnsupportedOperationException("addProductsToShoppingCart() is not implemented yet");
        }
        shoppingCart.addProductsToCart(products);
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shoppingCart.removeProductByName("Shirt");
    }

private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */

    String[] customerProductNames = {"Book", "Vanilla CSS", "The C Programming language"};
    ArrayList<Product> products = new ArrayList<>();
    String randomName = UUID.randomUUID().toString();
    for (String name: customerProductNames){
            Product product = shoppingCart.findProductByName(name);
            String randomText = UUID.randomUUID().toString();

            for (int i = 0; i < 3; i++){
                int rating = (int) Math.round(Math.random() * ( 5 - 1 ));
                Review review = new Review(randomName, rating, randomText);
                product.addReview(review);
            }
        }


    }


}
