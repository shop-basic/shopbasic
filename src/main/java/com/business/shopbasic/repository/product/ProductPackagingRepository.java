package com.business.shopbasic.repository.product;

import com.business.shopbasic.model.ProductPackaging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPackagingRepository extends JpaRepository<ProductPackaging, String> {


}

