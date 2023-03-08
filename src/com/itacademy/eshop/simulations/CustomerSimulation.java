package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

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

        Product laptop = shop.findProductByName("Cooking Book");
        shoppingCart.addProduct(laptop);

        Product fridge = shop.findProductByName("Apple Watch");
        shoppingCart.addProduct(fridge);

        Product book = shop.findProductByName("Shirt");
        shoppingCart.addProduct(book);

        Product shirt = shop.findProductByName("Fridge");
        shoppingCart.addProduct(shirt);

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

        List<Product> productList = shoppingCart.getProducts();

        Review review1 = new Review("Evaldas", 5, "Amazing");
        Review review2 = new Review("Valdas", 2, "Bad");
        Review review3 = new Review("Valda", 5, "Amazing");

        productList.get(0).addReview(review1);
        productList.get(1).addReview(review2);
        productList.get(2).addReview(review3);


    }


}
