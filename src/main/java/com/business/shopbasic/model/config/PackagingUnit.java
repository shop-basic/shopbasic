package com.business.shopbasic.model.config;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PackagingUnit {

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
    String unitId;
    String unit;
    String unitAbbr;

    public PackagingUnit() {
    }

    public PackagingUnit(String unitId, String unit, String unitAbbr) {
        this.unitId = unitId;
        this.unit = unit;
        this.unitAbbr = unitAbbr;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitAbbr() {
        return unitAbbr;
    }

    public void setUnitAbbr(String unitAbbr) {
        this.unitAbbr = unitAbbr;
    }
}

