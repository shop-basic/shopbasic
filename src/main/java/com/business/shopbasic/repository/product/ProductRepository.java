package com.business.shopbasic.repository.product;

import com.business.shopbasic.model.AllProductModel;
import com.business.shopbasic.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE Product set active_flag = 0 WHERE product_id = :productId")
    int passivate(@Param("productId") String productId);

    @Query(
            value = "select product_id as productId, avatar, p.name as productName, m.name as manufacturer, pc.name as category  from product p\t\n" +
            "inner join manufacturer m on p.manufacturer_manufacturer_id = m.manufacturer_id\n" +
            "inner join product_category pc on p.product_category_category_id = pc.category_id\n" +
            "where active_flag = 1",
            nativeQuery = true
    )
    List<AllProductModel> getAllProducts();

}

