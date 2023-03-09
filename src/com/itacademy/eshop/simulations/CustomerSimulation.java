package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

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
        Product product = new Product("Book", 5, Category.BOOKS);
        Product product1 = new Product("Shirt", 12, Category.CLOTHING);
        Product product2 = new Product("Pizza" , 3, Category.FOOD);
        Product product3 = new Product("TV", 400, Category.ELECTRONICS );
        shoppingCart.addProduct(product);
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);


//        throw new UnsupportedOperationException("addProductsToShoppingCart() is not implemented yet");
    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shoppingCart.removeProduct(shoppingCart.findProductByName("Shirt"));


//        throw new UnsupportedOperationException("removeProductsFromShoppingCart() is not implemented yet");
    }

private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */
        ArrayList<Product> productList = shoppingCart.getProducts();
    Review review1 = new Review("author1", 3, "good");
    Review review2 = new Review("author2", 4, "better");
    Review review3 = new Review("author1", 5, "best");
    productList.get(0).addReview(review1);
    productList.get(1).addReview(review2);
    productList.get(2).addReview(review3);
//    shoppingCart.setProducts(productList);

//        throw new UnsupportedOperationException("leaveReviewsAndRatingsForProducts() is not implemented yet");
    }


}
