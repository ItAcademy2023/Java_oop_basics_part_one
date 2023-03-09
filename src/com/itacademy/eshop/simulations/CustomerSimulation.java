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

       Product shirt =  shop.findProductByName("Shirt");
        shoppingCart.addProductToShoppingCart(shirt);
      Product book =  shop.findProductByName("Book");
        shoppingCart.addProductToShoppingCart(book);
        Product truck=shop.findProductByName("Truck");
        shoppingCart.addProductToShoppingCart(truck);

       Product phone= shop.findProductByName("Phone");
        shoppingCart.addProductToShoppingCart(phone);


        /**
         * User browses the shop and adds 4 products to the shopping cart.
         * One of them should be a book and other should be a shirt.
         */


    }

    private void removeProductsFromShoppingCart() {

        shoppingCart.removeProductByNameShoppingCart("Shirt");
        /**
         * User removes shirt from the shopping cart.
         */

    }

private void leaveReviewsAndRatingsForProducts() {

    Review rev= new Review("Human",3,"not bad");
    shoppingCart.addReview("Book",rev);
     rev= new Review("Human",1," bad");
    shoppingCart.addReview("Phone",rev);
     rev= new Review("Human",5," good");
    shoppingCart.addReview("Truck",rev);
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */

    }


}
