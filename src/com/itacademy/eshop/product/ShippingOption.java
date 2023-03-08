package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.Category;
import com.itacademy.eshop.product.types.ShippingType;

public class ShippingOption {

    private ShippingType type;
    private double price;
    private int estimatedDeliveryDays;

    public ShippingOption(ShippingType type) {
        this.type = type;
        this.price = calculatePrice(type);
        this.estimatedDeliveryDays = calculateDeliveryDays(type);
    }

    public ShippingType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getEstimatedDeliveryDays() {
        return estimatedDeliveryDays;
    }

    private double calculatePrice(ShippingType type) {
        switch (type) {
            case FREE:
                return 0.0;
            case STANDARD:
                return 5.50;
            case FAST:
                return 10.90;
            default:
                throw new IllegalArgumentException("Invalid shipping type: " + type);
        }
    }

    private int calculateDeliveryDays(ShippingType type) {
        switch (type) {
            case FREE:
                return 7;
            case STANDARD:
                return 3;
            case FAST:
                return 1;
            default:
                throw new IllegalArgumentException("Invalid shipping type: " + type);
        }
    }
}

