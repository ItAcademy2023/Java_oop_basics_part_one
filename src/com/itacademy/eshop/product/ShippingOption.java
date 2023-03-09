package com.itacademy.eshop.product;

import com.itacademy.eshop.product.types.ShippingType;

public class ShippingOption {

    private ShippingType shippingType;
    private double shippingPrice;
    private int estimatedDeliveryDays;

    public ShippingOption(ShippingType shippingType) {
        this.shippingType = shippingType;
    }

    public double getPrice() {
        return shippingPrice;
    }

    private double calculateShippingPrice(ShippingType type) {
        return switch (type) {
            case FREE -> 0.0;
            case STANDARD -> 5.50;
            case FAST -> 10.90;
        };
    }

    private int calculateDeliveryDays(ShippingType type) {
        return switch (type) {
            case FREE -> 7;
            case STANDARD -> 3;
            case FAST -> 1;
        };
    }
}

