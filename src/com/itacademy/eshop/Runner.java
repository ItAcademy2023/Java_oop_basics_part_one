package com.itacademy.eshop;
import com.itacademy.eshop.shop.ShoppingCart;
import com.itacademy.eshop.simulations.CustomerSimulation;
import com.itacademy.eshop.services.ShopService;
import com.itacademy.eshop.shop.Eshop;
import com.itacademy.eshop.simulations.ManagerSimulation;

public class Runner {

    public void run() {
        ShopService shopService = new ShopService();
        Eshop shop = shopService.createShop();
        ManagerSimulation managerSimulation = new ManagerSimulation(shop);
        managerSimulation.simulate();

        /**
         * After the simulation, the shop should contain at least on product per category except FOOD.
         * Should contain products with the following names: "Shirt", "Book".
         * Should not contain products with the following names: "Laptop".
         * Price for the product "Shirt" should be 20.
         */
        shop.printProducts();

        CustomerSimulation customerSimulation = new CustomerSimulation(shop);
        ShoppingCart shoppingCart = customerSimulation.simulateCustomerShopping();
        /**
         * After the simulation, the shopping cart should contain 3 products. One of them should be a book.
         * Should have total price combined by all products in the cart
         */
        shoppingCart.printShoppingCart();
    }
}
