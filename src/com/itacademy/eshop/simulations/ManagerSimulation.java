package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.Stock;
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
        shop.addProduct(new Product("Laptop", 1000, Category.ELECTRONICS, Stock.OutOfStock));
        Product book = (new Product("Career book", 10, Category.BOOKS, Stock.InStock));
        Product shirt = (new Product("Shirt", 1, Category.CLOTHING, Stock.InStock));


    }

    private void findAndRemoveOneProduct() {
        /**
         * manager searcher for a product with the name "Laptop" (the one added a moment before) and removes it from the shop
         */
        shop.printProducts();
        shop.removeProductByName("Laptop");
        System.out.println("*****************************************************");
        shop.printProducts();
    }

    private void changePriceForOneProduct() {
        /**
         * manager searches for a product with the name "Shirt" (the one added a moment before) and changes its price to 20
         */
        shop.printProducts();

        shop.changePriceForProduct("Shirt", 20);
        System.out.println("*****************************************************");
        shop.printProducts();
    }

    private void removeAllProductsWithCategory(Category category) {
        /**
         * manager removes all products with the category FOOD
         */
        shop.printProducts();

        shop.removeProductByCategory(Category.FOOD);
        System.out.println("*****************************************************");
        shop.printProducts();
    }


}