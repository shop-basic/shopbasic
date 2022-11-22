package com.business.shopbasic.repository.product;

import com.business.shopbasic.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE Product set active_flag = 0 WHERE product_id = :productId")
    public int passivate(@Param("productId") String productId);

}

