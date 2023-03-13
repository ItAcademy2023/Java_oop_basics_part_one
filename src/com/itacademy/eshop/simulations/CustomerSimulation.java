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
shoppingCart.addProduct(shop.findProductByName("Shirt"));
shoppingCart.addProduct(shop.findProductByName("Book"));
shoppingCart.addProduct(shop.findProductByName("Dress"));
shoppingCart.addProduct(shop.findProductByName("toy"));

    }

    private void removeProductsFromShoppingCart() {
        shoppingCart.removeProduct(new Product("Shirt", 20, Category.CLOTHING));
            /**
         * User removes shirt from the shopping cart.
         */

    }

private void leaveReviewsAndRatingsForProducts() {
       Product.addReview(shop.findProductByName("Shirt"),("Anna", 5,"good"));
       Product.addReview(new Review("Sid", 5, "normal"));
       Product.addReview(new Review("Hither", 4, "ok"));
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */



    }


}
