package com.business.shopbasic.model;

import com.business.shopbasic.model.config.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductFormItems {

    private List<Manufacturer> manufacturers;
    private List<ProductCategory> categories;

    public ProductFormItems() {
    }

    public ProductFormItems(List<Manufacturer> manufacturers, List<ProductCategory> categories) {
        this.manufacturers = manufacturers;
        this.categories = categories;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ProductCategory> categories) {
        this.categories = categories;
    }
}

