package com.business.shopbasic.service;


import com.business.shopbasic.model.Product;
import com.business.shopbasic.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(String productId) {
        return productRepository.getById(productId);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }


}

