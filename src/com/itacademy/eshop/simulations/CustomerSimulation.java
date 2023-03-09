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
        addProductsToShoppingCart("Shirt");
        addProductsToShoppingCart("Book");
        addProductsToShoppingCart("Laptop");
        addProductsToShoppingCart("banana phone");
        removeProductsFromShoppingCart("Shirt");
        leaveReviewsAndRatingsForProducts("Shirt", new Review("Bob", 5, "Great"));
        leaveReviewsAndRatingsForProducts("Book", new Review("Bob", 5, "Great"));
        leaveReviewsAndRatingsForProducts("Laptop", new Review("Bob", 5, "Great"));
        return shoppingCart;
    }

    private void addProductsToShoppingCart(String productName) {
        /**
         * User browses the shop and adds 4 products to the shopping cart.
         * One of them should be a book and other should be a shirt.
         */
        shoppingCart.addProductToCart(shop.findProductByName(productName));
    }

    private void removeProductsFromShoppingCart(String productName) {
        /**
         * User removes shirt from the shopping cart.
         */
        shoppingCart.removeProductByName(productName);
    }

private void leaveReviewsAndRatingsForProducts(String productName, Review review) {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
        shop.addReviewToProduct(shop.findProductByName(productName), review);
    }


}
