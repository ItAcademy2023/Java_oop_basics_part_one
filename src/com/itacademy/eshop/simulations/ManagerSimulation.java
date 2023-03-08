package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

/**
 * This class simulates the activity of a manager in the e-shop. The manager will create new products and add them to the shop,
 * remove one product from the shop, change the price for a product, and remove all products with the category FOOD.
 */
public class ManagerSimulation {

    private Eshop shop;

    public ManagerSimulation(Eshop shop) {
        this.shop = shop;
    }

    public void simulate() {
        addThreeNewProducts();
        findAndRemoveOneProduct();
        changePriceForOneProduct();
        removeAllProductsWithCategory(Category.FOOD);
    }

    private void addThreeNewProducts() {
        /**
         * adds three new products to the shop. One of them should be a book, one should be a Laptop, and one should be a shirt.
         */
        Product laptop = new Product("Laptop", 1000, Category.ELECTRONICS);
        Product book = new Product("Book", 56.8, Category.BOOKS);
        Product shirt = new Product("Shirt", 28, Category.CLOTHING);

        shop.addProduct(laptop);
        shop.addProduct(book);
        shop.addProduct(shirt);
    }

    private void findAndRemoveOneProduct() {
        Product laptop = shop.findProductByName("Laptop");  // method returns Product, so we need to create it.
        shop.removeProductByName("Laptop");         // method returns void, so no need to create Project object.

        /**
         * manager searcher for a product with the name "Laptop" (the one added a moment before) and removes it from the shop
         */
    }

    private void changePriceForOneProduct() {
        shop.changePriceForProduct("Shirt", 20);

        /**
         * manager searches for a product with the name "Shirt" (the one added a moment before) and changes its price to 20
         */
    }

    private void removeAllProductsWithCategory(Category category) {
        shop.removeProductByCategory(Category.FOOD);

        /**
         * manager removes all products with the category FOOD
         */
    }


}