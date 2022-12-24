package com.business.shopbasic.model;

import com.business.shopbasic.model.config.PackagingUnit;
import com.business.shopbasic.model.config.ProductCategory;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

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
    private String description;
    private boolean activeFlag;
    private String avatar;
    private Timestamp createTime;
    private Timestamp revisionTime;
    @ManyToOne
    @JoinColumn
    private Manufacturer manufacturer;
    @ManyToOne
    @JoinColumn
    private PackagingUnit packagingUnit;
    @ManyToOne
    @JoinColumn
    private ProductCategory productCategory;
    @OneToMany
    @JoinColumn
    private List<ProductPackaging> packaging;

    public Product() {
    }

    public Product(String productId, @NonNull String name, boolean activeFlag, String avatar, Timestamp createTime, Timestamp revisionTime, Manufacturer manufacturer, PackagingUnit packagingUnit, ProductCategory productCategory, List<ProductPackaging> packaging, String description) {
        this.productId = productId;
        this.name = name;
        this.activeFlag = activeFlag;
        this.avatar = avatar;
        this.createTime = createTime;
        this.revisionTime = revisionTime;
        this.manufacturer = manufacturer;
        this.packagingUnit = packagingUnit;
        this.productCategory = productCategory;
        this.packaging = packaging;
        this.description = description;
    }

    public Product(String productId, @NonNull String name, boolean activeFlag, String avatar, Timestamp createTime, Timestamp revisionTime, Manufacturer manufacturer, String description) {
        this.productId = productId;
        this.name = name;
        this.activeFlag = activeFlag;
        this.avatar = avatar;
        this.createTime = createTime;
        this.revisionTime = revisionTime;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public PackagingUnit getPackagingUnit() {
        return packagingUnit;
    }

    public void setPackagingUnit(PackagingUnit packagingUnit) {
        this.packagingUnit = packagingUnit;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getRevisionTime() {
        return revisionTime;
    }

    public void setRevisionTime(Timestamp revisionTime) {
        this.revisionTime = revisionTime;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public List<ProductPackaging> getPackaging() {
        return packaging;
    }

    public void setPackaging(List<ProductPackaging> productPackagings) {
        this.packaging = productPackagings;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


