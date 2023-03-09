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
        ArrayList<Product> products = new ArrayList<>();
        String[] customerProductNames = {"Shirt", "Book", "The C Programming language", "Vanilla CSS"};
        for (String name: customerProductNames){
            products.add(shop.findProductByName(name));
        }
        if (products.isEmpty()){
            throw new UnsupportedOperationException("addProductsToShoppingCart() is not implemented yet");
        }
        for (Product product: products){
            shoppingCart.addProductToCart(product);
        }
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

    String[] customerProductNames = {"Book", "Vanilla CSS", "The C Programming language"};
    ArrayList<Product> products = new ArrayList<>();
    ArrayList <Review> reviews = new ArrayList<>();

    reviews.add(new Review("John", 4, "Super likey"));
    reviews.add(new Review("John", 1, "Not Super likey"));
    reviews.add(new Review("John", 2, "Hmm thinking if Super likey"));
    reviews.add(new Review("Peter", 3, "Bad"));
    reviews.add(new Review("Peter", 4, "404"));
    reviews.add(new Review("Peter", 1, "Dislike"));
    reviews.add(new Review("Logan", 2, "Why is this undefined"));
    reviews.add(new Review("Logan", 1, "[object Object]"));
    reviews.add(new Review("Logan", 5, "Me no like eval()"));

    for (String name: customerProductNames){
            Product product = shoppingCart.findProductByName(name);
            int i = 0;
            int checkAgainstNumber = 3;

            while (i < checkAgainstNumber){
                product.addReview(reviews.get(i));
                i++;
            }
            i += 3;
            checkAgainstNumber += 3;
        }
    }
}
