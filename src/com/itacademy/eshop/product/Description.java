package com.itacademy.eshop.product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Description {

    private String productDescription;
    private String descriptionAdditionTime;

    public Description() {}

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getDescriptionAdditionTime() {
        return descriptionAdditionTime;
    }

    public void setDescriptionAdditionTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.descriptionAdditionTime = dtf.format(now);
    }
}
