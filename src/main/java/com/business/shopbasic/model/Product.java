package com.business.shopbasic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    private String productId;
    @NonNull
    private String name;
    private double price;
    private float packagingQuantity;
    private String unit;
    private String unitAbbreviation;
    private boolean activeFlag;

    public Product() {
    }

    public Product(String productId, String name, double price, float packagingQuantity, String unit, String unitAbbreviation, boolean activeFlag) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.packagingQuantity = packagingQuantity;
        this.unit = unit;
        this.unitAbbreviation = unitAbbreviation;
        this.activeFlag = activeFlag;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getPackagingQuantity() {
        return packagingQuantity;
    }

    public void setPackagingQuantity(float packagingQuantity) {
        this.packagingQuantity = packagingQuantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitAbbreviation() {
        return unitAbbreviation;
    }

    public void setUnitAbbreviation(String unitAbbreviation) {
        this.unitAbbreviation = unitAbbreviation;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }
}


