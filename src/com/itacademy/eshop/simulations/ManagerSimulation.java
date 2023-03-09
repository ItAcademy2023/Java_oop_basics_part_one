package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.Manufacturer;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;

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
        findAndRemoveOneProduct("Laptop");
        changePriceForOneProduct("Shirt", 20);
        removeAllProductsWithCategory(Category.FOOD);
    }

    private void addThreeNewProducts() {
        /**
         * adds three new products to the shop. One of them should be a book, one should be a Laptop, and one should be a shirt.
         */
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Laptop", 1000, Category.ELECTRONICS, Manufacturer.ASUS));
        products.add(new Product("Shirt", 1000, Category.CLOTHING, Manufacturer.MM6));
        products.add(new Product("Book", 1000, Category.BOOKS, Manufacturer.BJARNESTOUSTROP));
        for (Product product: products){
            shop.addProduct(product);
        }

    }

    private void findAndRemoveOneProduct(String name) {
        /**
         * manager searcher for a product with the name "Laptop" (the one added a moment before) and removes it from the shop
         */
        shop.removeProductByName(name);
    }
    private ArrayList<Product> getProductData() {
       return shop.getProducts(true);
    }

    private void changePriceForOneProduct(String name, double newPrice) {
        /**
         * manager searches for a product with the name "Shirt" (the one added a moment before) and changes its price to 20
         */
        shop.changePriceForProduct(name, newPrice);
    }

    private void removeAllProductsWithCategory(Category category) {
        /**
         * manager removes all products with the category FOOD
         */
        shop.removeProductByCategory(category);
    }


}