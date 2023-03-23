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

        shop.addProduct(new Product("Laptop2", 1000, Category.ELECTRONICS));
        shop.addProduct(new Product ("Book2", 7.99, Category.BOOKS));
        shop.addProduct(new Product("T-shirt", 12.35, Category.CLOTHING));
    }

    private void findAndRemoveOneProduct() {

        /**
         * manager searcher for a product with the name "Laptop" (the one added a moment before) and removes it from the shop
         */
        shop.removeProductByName("Laptop2");
    }

    private void changePriceForOneProduct() {
        /**
         * manager searches for a product with the name "Shirt" (the one added a moment before) and changes its price to 20
         */
        shop.changePriceForProduct("T-shirt", 20);
    }

    private void removeAllProductsWithCategory(Category category) {
        /**
         * manager removes all products with the category FOOD
         */
        shop.removeProductByCategory(category);
    }
}