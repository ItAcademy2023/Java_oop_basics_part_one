package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
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
        Product chosenProduct1 = shop.findProductByName("Dune");
        Product chosenProduct2 = shop.findProductByName("Shirt");
        Product chosenProduct3 = shop.findProductByName("Phone");
        Product chosenProduct4 = shop.findProductByName("Pants");

        shoppingCart.addProduct(chosenProduct1);
        shoppingCart.addProduct(chosenProduct2);
        shoppingCart.addProduct(chosenProduct3);
        shoppingCart.addProduct(chosenProduct4);

//        throw new UnsupportedOperationException("addProductsToShoppingCart() is not implemented yet");
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shoppingCart.removeProductByName("Shirt");

//        throw new UnsupportedOperationException("removeProductsFromShoppingCart() is not implemented yet");
    }

private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
    ArrayList<Product> productList = shoppingCart.getProducts();
    productList.get(0).addReview(new Review("Tomas", 5, "Great book"));
    productList.get(1).addReview(new Review("Agne", 4, "Good phone, battery week"));
    productList.get(2).addReview(new Review("Lukas", 3, "Too small"));
//        throw new UnsupportedOperationException("leaveReviewsAndRatingsForProducts() is not implemented yet");
    }


}
