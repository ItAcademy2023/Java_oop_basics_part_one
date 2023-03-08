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
//        throw new UnsupportedOperationException("addProductsToShoppingCart() is not implemented yet");

        shoppingCart.addProduct(new Product("shirt", 15.90, Category.CLOTHING));
        shoppingCart.addProduct(new Product("stories", 15.90, Category.BOOKS));
        shoppingCart.addProduct(new Product("phone", 600.90, Category.ELECTRONICS));
        shoppingCart.addProduct(new Product("lego", 35.90, Category.TOYS));
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
//        throw new UnsupportedOperationException("removeProductsFromShoppingCart() is not implemented yet");

        shoppingCart.removeProduct(new Product("shirt", 15.90, Category.CLOTHING));
    }

    private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
//        throw new UnsupportedOperationException("leaveReviewsAndRatingsForProducts() is not implemented yet");

        ArrayList<Product> product = shoppingCart.getProducts();

        Product product1 = shoppingCart.findProductByName("shirt");
        Product product2 = shoppingCart.findProductByName("lego");
        Product product3 = shoppingCart.findProductByName("phone");

        Review review = new Review("tom", 4, "very comfortable shirt");
        product1.addReview(review);

        Review review1 = new Review("anna", 2, "not impressed");
        product2.addReview(review1);

        Review review2 = new Review("emoji", 4, "i like it");
        product3.addReview(review2);


    }

}
