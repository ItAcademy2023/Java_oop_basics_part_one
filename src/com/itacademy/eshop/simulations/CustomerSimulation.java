package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Author;
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
        shoppingCart.AddItem(shop.findProductByName("Shirt"));
        shoppingCart.AddItem(shop.findProductByName("Harry Potter"));
        shoppingCart.AddItem(shop.findProductByName("Laptop"));
        shoppingCart.AddItem(shop.findProductByName("Bike"));

    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shoppingCart.RemoveItem(shop.findProductByName("Shirt"));
    }

private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
    shop.findProductByName("Shirt").addReview(new Review(new Author("John", 23, "Sweden"), 1, "Shirt was oversized"));
    shop.findProductByName("Laptop").addReview(new Review(new Author("John", 23, "Sweden"), 5, "Laptop runs very well :)"));
    shop.findProductByName("Bike").addReview(new Review(new Author("John", 23, "Sweden"), 4, "Bike was great, price might be too high"));
    }


}
