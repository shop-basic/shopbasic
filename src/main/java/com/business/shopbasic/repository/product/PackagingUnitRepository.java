package com.business.shopbasic.repository.product;

import com.business.shopbasic.model.config.PackagingUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackagingUnitRepository extends JpaRepository<PackagingUnit, String> {


}

