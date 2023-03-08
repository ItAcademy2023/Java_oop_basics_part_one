package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;

import java.util.ArrayList;

/**
 * This class represents a simulation of a customer shopping on an Eshop.
 * The customer can add and remove products from their shopping cart,
 * as well as leave reviews and ratings for the products.
 */
public class CustomerSimulation {
    private Eshop shop;
    private ShoppingCart shoppingCart;
    private Product product;
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
        //throw new UnsupportedOperationException("addProductsToShoppingCart() is not implemented yet");
        shoppingCart.addProduct(shop.findProductByName("Crime and Punishment"));
        shoppingCart.addProduct(shop.findProductByName("Supreme Hoodie"));
        shoppingCart.addProduct(shop.findProductByName("Jeans"));
        shoppingCart.addProduct(shop.findProductByName("Fidget Spinner"));
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        //throw new UnsupportedOperationException("removeProductsFromShoppingCart() is not implemented yet");
        shoppingCart.removeProductByName("Supreme Hoodie");
    }

    private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
        //throw new UnsupportedOperationException("leaveReviewsAndRatingsForProducts() is not implemented yet");
        shoppingCart.findProductByName("Crime and Punishment").addReview(new Review("Fyodor Dostoevsky", 10, "Very good"));
        shoppingCart.findProductByName("Fidget Spinner").addReview(new Review("Alibaba", 9, "Fun toy"));
        shoppingCart.findProductByName("Jeans").addReview(new Review("Bershka", 7, "Very blue"));
    }


}
