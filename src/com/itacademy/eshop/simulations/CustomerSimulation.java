package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Author;
import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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
        Product book = new Product("Book", 10, Category.BOOKS);
        shop.addProduct(book);
        Product shirt = new Product("Shirt", 15, Category.CLOTHING);
        shop.addProduct(shirt);
        Product toy = new Product("Toy", 10, Category.TOYS);
        shop.addProduct(toy);
        Product pineapple = new Product("Pineapple", 9, Category.FOOD);
        shop.addProduct(pineapple);
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shop.removeProductByName("Shirt");
    }

    private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
        ArrayList<Product> products = shoppingCart.getProducts();
        int iterCount = Math.min(products.size(), 3);
        for (int i = 0; i < iterCount; i++) {
            Author author = new Author("unknown_user");
            Product product = products.get(i);
            int randomRating = ThreadLocalRandom.current().nextInt(1, 6);
            Review review = new Review(author, randomRating, "Comment about the product " + product.getName());
            product.addReview(review);
        }
    }
}
