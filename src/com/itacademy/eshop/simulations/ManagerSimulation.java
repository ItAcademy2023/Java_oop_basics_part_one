package com.itacademy.eshop.simulations;

import com.itacademy.eshop.product.Product;
import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.shop.Eshop;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner threeProductsScanner = new Scanner(System.in);
        System.out.println("Please add three new products : first a book ");
        String newNameBook = threeProductsScanner.nextLine();
        System.out.println("Please add the second product: a laptop");
        String newNameLaptop = threeProductsScanner.nextLine();
        System.out.println("Please add the third product : a shirt ");
        String newNameShirt = threeProductsScanner.nextLine();
        System.out.println("Please insert the price of the book");
        int newPriceBook = threeProductsScanner.nextInt();
        System.out.println("Please insert the price of the Laptop");
        int newPriceLaptop = threeProductsScanner.nextInt();
        System.out.println("Please insert the price of the shirt");
        int newPriceShirt = threeProductsScanner.nextInt();

        ArrayList<Product> threeProductsArrayList = new ArrayList<>();
        shop.addProduct(new Product(newNameBook, newPriceBook, Category.BOOKS));
        shop.addProduct(new Product(newNameShirt, newPriceShirt, Category.CLOTHING));
        shop.addProduct(new Product(newNameLaptop, newPriceLaptop, Category.ELECTRONICS));

        shop.addProduct(new Product("Lithuania",370,Category.NATIONALITY));

        System.out.println(threeProductsArrayList);
    }

    private void findAndRemoveOneProduct ()  {


        /**
         * manager searcher for a product with the name "Laptop" (the one added a moment before) and removes it from the shop
         */
        shop.findProductByName("newNameLaptop");
        shop.removeProductByName("newNameLaptop");
        System.out.println("The product laptop has being found and removed succesfully");



    }

    private void changePriceForOneProduct() {
        /**
         * manager searches for a product with the name "Shirt" (the one added a moment before) and changes its price to 20
         */
        shop.changePriceForProduct("newNameShirt",20);
        System.out.println("The price of the shirt product has being changed to 20");

    }

    private void removeAllProductsWithCategory(Category category) {


        /**
         * manager removes all products with the category FOOD
         */
        shop.removeProductByCategory(Category.FOOD);
        System.out.println("Products under Category: FOOD has being removed ");
    }


}