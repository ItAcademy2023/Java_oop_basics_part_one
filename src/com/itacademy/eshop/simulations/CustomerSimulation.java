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
        ArrayList < Product> toAdd = new ArrayList<>();

        toAdd.add(shop.findProductByName("Shirt"));
        toAdd.add(shop.findProductByName("Book"));
        toAdd.add(shop.findProductByName("Fidget Spinner"));
        toAdd.add(shop.findProductByName("Ipod"));

        shoppingCart.setProducts(toAdd);


        //throw new UnsupportedOperationException("addProductsToShoppingCart() is not implemented yet");
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */

        for (Product item: shoppingCart.getProducts()) {
            if(item.getName().equals("Shirt")){
                shoppingCart.getProducts().remove(item);
            }
        }

        //throw new UnsupportedOperationException("removeProductsFromShoppingCart() is not implemented yet");
    }

private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */

    for (Product item: shoppingCart.getProducts()) {
        if(item.getName().equals("Book")){
            item.addReview(new Review("Sandra", 5, "Best book of all best books!!!"));
        }
        if(item.getName().equals("Fidget Spinner")){
            item.addReview(new Review("Sandra", 4, "Could spin a bit more..."));
        }
        if(item.getName().equals("Ipod")){
            item.addReview(new Review("Sandra", 3, "Nothing beats Vinyl"));
        }

    }

        //throw new UnsupportedOperationException("leaveReviewsAndRatingsForProducts() is not implemented yet");
    }


}
