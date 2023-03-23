package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;
import com.itacademy.eshop.product.Review;

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

        shoppingCart.addProductToCart(shop.findProductByName("shirt"));
        shoppingCart.addProductToCart(shop.findProductByName("Hello World"));
        shoppingCart.addProductToCart(shop.findProductByName("Apples"));
        shoppingCart.addProductToCart(shop.findProductByName("Doll"));

    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
       shoppingCart.removeProductFromCart(shop.findProductByName("shirt"));
    }

private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
       Review firstReview = new Review("Audrius", 9,"Great shirt");
       Review secondReview = new Review("Egle", 7, "Not sure about this book.");
       Review thirdReview = new Review("Vytas", 10, "Great toy. My daughter loved it.");
       shop.findProductByName("shirt").addReview(firstReview);
       shop.findProductByName("Hello World").addReview(secondReview);
       shop.findProductByName("Doll").addReview(thirdReview);
    }


}
