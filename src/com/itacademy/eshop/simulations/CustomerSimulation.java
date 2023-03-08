package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
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
        shoppingCart.addProduct(this.shop.findProductByName("Lenovo"));
        shoppingCart.addProduct(this.shop.findProductByName("HP"));
        shoppingCart.addProduct(this.shop.findProductByName("Java For Dummies"));
        shoppingCart.addProduct(this.shop.findProductByName("Supreme"));

    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shoppingCart.removeProduct(this.shop.findProductByName("Supreme"));

    }

private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
        Review review = new Review("Tomas", 8, "Labai geras kompas");
        Review review1 = new Review("Linas", 6, "Geras");
        Review review2 = new Review("Juozas", 2, "Silpna knyga");
        this.shop.findProductByName("Lenovo").addReview(review);
        this.shop.findProductByName("HP").addReview(review1);
        this.shop.findProductByName("Java For Dummies").addReview(review2);
    }


}
