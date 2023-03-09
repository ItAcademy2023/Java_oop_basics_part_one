 package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.Review;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.shop.ShoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner fourProductsShoppingScanner = new Scanner(System.in);
        System.out.println("Please add three new products : first a book ");
        String newNameBook = fourProductsShoppingScanner.nextLine();
        System.out.println("Please add the second product: second a shirt");
        String newNameShirt = fourProductsShoppingScanner.nextLine();
        System.out.println("Please add the third product : this time an electronics");
        String newNameElectronics = fourProductsShoppingScanner.nextLine();
        System.out.println("Please add the third product : this time a Toy");
        String newNameToy = fourProductsShoppingScanner.nextLine();
        System.out.println("Please insert the price of the book");
        int newPriceBook = fourProductsShoppingScanner.nextInt();
        System.out.println("Please insert the price of the shirt");
        int newPriceShirt = fourProductsShoppingScanner.nextInt();
        System.out.println("Please insert the price of the electronics");
        int newPriceElectronics = fourProductsShoppingScanner.nextInt();
        System.out.println("Please insert the price of the Toy");
        int newPriceToy = fourProductsShoppingScanner.nextInt();

        ArrayList<Product>fourProductsShoppingScanner = new ArrayList<>();
        shop.addProduct(new Product(newNameBook, newPriceBook, Category.BOOKS));
        shop.addProduct(new Product(newNameShirt, newPriceShirt, Category.CLOTHING));
        shop.addProduct(new Product(newNameElectronics, newPriceElectronics, Category.ELECTRONICS));
        shop.addProduct(new Product(newNameToy, newPriceToy, Category.ELECTRONICS));

        System.out.println(fourProductsShoppingScanner);

    }

    private void removeProductsFromShoppingCart() {
        /**
         * User removes shirt from the shopping cart.
         */
        shop.findProductByName("newNameShirt");
        shop.removeProductByName("newNameShirt");
        System.out.println("The product has being found and removed successfully");
    }

private void leaveReviewsAndRatingsForProducts() {
        /**
         * User leaves 3 reviews and ratings for the products in the shopping cart.
         */

    ArrayList<Review> threeReviews= new ArrayList<>();
    Review firstReview = new Review("Pascal",4,"Best seller");
    Review secondReview = new Review("Shakespeare",5,"Nobel price seller");
    Review thirdReview = new Review("Didier",3,"Modest seller");

    System.out.println("The three reviews" +threeReviews+ " we have are :" +firstReview+ " : " +secondReview+ " : " +thirdReview);

    }


}
