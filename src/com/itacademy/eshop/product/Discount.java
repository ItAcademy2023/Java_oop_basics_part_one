package com.itacademy.eshop.product;

public class Discount {

    private double discountSize;
    private String discountName;

    public Discount(double discountSize, String discountName) {
        this.discountSize = discountSize;
        this.discountName = discountName;
    }

    public double getDiscountSize() {
        return discountSize;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountSize(double discountSize) {
        this.discountSize = discountSize;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }
}
