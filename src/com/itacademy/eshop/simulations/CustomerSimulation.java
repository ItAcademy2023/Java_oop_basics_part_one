package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
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
        shoppingCart.products.add(shop.findProductByName("Shirt"));
        shoppingCart.products.add(shop.findProductByName("Banana"));
        shoppingCart.products.add(shop.findProductByName("Apple"));
        shoppingCart.products.add(shop.findProductByName("Orange"));
        shoppingCart.products.add(shop.findProductByName("Pig"));
    }

    private void removeProductsFromShoppingCart() {
        shoppingCart.products.remove(shoppingCart.products.get(0));
    }

private void leaveReviewsAndRatingsForProducts() {
        shoppingCart.products.get(0).addReview(new Review("Nikita", 5, "Lorem Ipsum"));
        shoppingCart.products.get(1).addReview(new Review("Nikita", 5, "Lorem Ipsum"));
        shoppingCart.products.get(2).addReview(new Review("Nikita", 5, "Lorem Ipsum"));
    }


}
