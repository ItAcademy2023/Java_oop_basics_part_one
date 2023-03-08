package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.product.types.Category;
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
        shoppingCart.addProductToCart(shop.findProductByName("Book"));
        shoppingCart.addProductToCart(shop.findProductByName("Laptop"));
        shoppingCart.addProductToCart(shop.findProductByName("banana phone"));
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
        shop.addReviewToProduct(shop.findProductByName("Shirt"), new Review("Bob", 5, "Great"));
        shop.addReviewToProduct(shop.findProductByName("Book"), new Review("Dan", 5, "Wowzers"));
        shop.addReviewToProduct(shop.findProductByName("Laptop"), new Review("Jon", 5, "Amazed"));
    }


}
