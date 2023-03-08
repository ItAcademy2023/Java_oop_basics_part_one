package com.itacademy.eshop.product;

public class RecentBuyers {
    private String buyer;
    private int age;
    private String country;

    public RecentBuyers(String buyer, int age, String country) {
        this.buyer = buyer;
        this.age = age;
        this.country = country;
    }

    public String getBuyer() {
        return buyer;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}
