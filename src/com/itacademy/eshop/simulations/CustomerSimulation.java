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
        Review newReview1 = new Review(5, "nice I like");
        Review newReview2 = new Review(5, "nice I like more");
        Review newReview3 = new Review(5, "nice I like most");
        newReview1.setAuthor("Bob", "Bobson");
        newReview2.setAuthor("Jon", "Jonson");
        newReview3.setAuthor("Dan", "Danson");
        Review newReview4 = new Review("Name", "Surname", 5, "very cool");
        leaveReviewsAndRatingsForProducts("Shirt", newReview1);
        leaveReviewsAndRatingsForProducts("Book", newReview2);
        leaveReviewsAndRatingsForProducts("Laptop", newReview3);
        leaveReviewsAndRatingsForProducts("banana phone", newReview3);

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
