package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;
import com.itacademy.eshop.product.types.Author;
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
        shoppingCart.addToShopingCart(new Product("GoT", 24.99, Category.BOOKS));
        shoppingCart.addToShopingCart(new Product("shirt", 19.99, Category.CLOTHING));
        shoppingCart.addToShopingCart(new Product("tablet", 259.99, Category.ELECTRONICS));
        shoppingCart.addToShopingCart(new Product("wooden horse", 99.99, Category.TOYS));
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shoppingCart.removeFromShopingCart("shirt");
    }

    private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
        shop.addReviewForProduct("tablet", new Review(new Author("dziugas"), 5, "too slow for price"));
        shop.addReviewForProduct("wooden horse", new Review(new Author("dziugas"), 8, "good quality"));
        shop.addReviewForProduct("GoT", new Review(new Author("dziugas"), 9, "very good book"));


    }


}
