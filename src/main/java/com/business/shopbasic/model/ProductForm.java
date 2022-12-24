package com.business.shopbasic.model;

import org.springframework.stereotype.Component;

@Component
public class ProductForm {

    private String name;
    private String categoryId;
    private String manufacturerId;
    private String description;
    private String image;

    public ProductForm() {
    }

    public ProductForm(String productName, String categoryId, String manufacturerId, String description, String image) {
        this.name = productName;
        this.categoryId = categoryId;
        this.manufacturerId = manufacturerId;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
