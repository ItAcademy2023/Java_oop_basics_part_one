package com.itacademy.eshop.product;

import java.time.LocalDateTime;

public class Description {

    private String productDescription;
    private LocalDateTime descriptionAdditionTime;

    public Description(String description) {
        this.productDescription = description;
        this.descriptionAdditionTime = LocalDateTime.now();
    }

    public Description() {

    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public LocalDateTime getDescriptionAdditionTime() {
        return descriptionAdditionTime;
    }

    public void setDescriptionAdditionTime(LocalDateTime descriptionAdditionTime) {
        this.descriptionAdditionTime = descriptionAdditionTime;
    }

    @Override
    public String toString() {
        return productDescription + " | " + descriptionAdditionTime;
    }
}
