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
        Product book = shop.findProductByName("SomeBook");
        Product TV = shop.findProductByName("TV");
        Product pizza = shop.findProductByName("Pizza");
        Product shirt = shop.findProductByName("Shirt");

        shoppingCart.addProduct(book);
        shoppingCart.addProduct(TV);
        shoppingCart.addProduct(pizza);
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
        shop.findProductByName("Pizza").addReview(new Review("Chef Pesto", 8, "Not a bad pizza."));
        shop.findProductByName("SomeBook").addReview(new Review("Reader R", 7, "This book is too shallow."));
        shop.findProductByName("TV").addReview(new Review("Expert T", 8, "Could be better quality"));
    }
}
