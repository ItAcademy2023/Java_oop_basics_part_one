package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Author;
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
        shoppingCart.addProductToCart(shop.findProductByName("Laptop"));
        shoppingCart.addProductToCart(shop.findProductByName("Book"));
        shoppingCart.addProductToCart(shop.findProductByName("Laptop"));
        shoppingCart.addProductToCart(shop.findProductByName("Shirt"));

        /**
         * User browses the shop and adds 4 products to the shopping cart.
         * One of them should be a book and other should be a shirt.
         */
    }

    private void removeProductsFromShoppingCart() {
       shoppingCart.removeProductFromCart("Shirt");
        /**
         * User removes shirt from the shopping cart.
         */
    }

    private void leaveReviewsAndRatingsForProducts() {
        shoppingCart.writeReviewForProduct("Book", new Review(new Author("Ruta", "Last", 33), 5, "Great!"));
        shoppingCart.writeReviewForProduct("Laptop", new Review(new Author("Goda", "Bran", 25), 4, "Quite good."));

        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
    }
}
