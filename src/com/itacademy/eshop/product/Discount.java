package com.itacademy.eshop.product;

public class Discount {

    private double size;
    private String name;

    public Discount(double size, String name) {
        this.size = size;
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
