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

        Product prod = new Product("Book",55, Category.BOOKS);
        shoppingCart.addProduct(prod);
        prod = new Product("Shirt",65, Category.CLOTHING);
        shoppingCart.addProduct(prod);
        prod = new Product("Laptop",45, Category.ELECTRONICS);
        shoppingCart.addProduct(prod);
        prod = new Product("Food",52, Category.FOOD);
        shoppingCart.addProduct(prod);
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

        Review rev = new Review("Human",5,"Nice");
        shoppingCart.addReview("Book",rev);
        rev = new Review("Human2",3,"Ok");
        shoppingCart.addReview("Food",rev);
        rev = new Review("Human3",1,"Bad");
        shoppingCart.addReview("Laptop",rev);
    }


}
