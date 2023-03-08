package com.itacademy.eshop.product;

public class Information {
    private String manufacturer;
    private String publishDate;

    public Information() {
    }

    public Information(String manufacturer, String publishDate) {
        this.manufacturer = manufacturer;
        this.publishDate = publishDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
