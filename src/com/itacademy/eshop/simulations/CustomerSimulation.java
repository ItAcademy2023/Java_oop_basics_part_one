package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;

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
        shoppingCart.addProductToCart(shop.findProductByName("Shirt"));
        shoppingCart.addProductToCart(shop.findProductByName("Pants"));
        shoppingCart.addProductToCart(shop.findProductByName("iPhone"));
        shoppingCart.addProductToCart(shop.findProductByName("Roomba"));


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
        Product shirt = shoppingCart.findProductByName("Shirt");
        shirt.addReview(new Review("Tom", 10,"beautiful"));
        shirt.addReview(new Review("Nick", 9,"best shirt I ever bought"));
        shirt.addReview(new Review("Arnold", 10,"Comfortable"));
    }


}
