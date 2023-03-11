package com.itacademy.eshop.product;

public class Discount {
    private int discountSize;
    private String holiday;

    public Discount(int discountSize, String holiday ){
        this.discountSize = discountSize;
        this.holiday = holiday;

    }

    public int getDiscountSize() {
        return this.discountSize;
    }

    public void setDiscountSize(int discountSize) {
        this.discountSize = discountSize;
    }
}

