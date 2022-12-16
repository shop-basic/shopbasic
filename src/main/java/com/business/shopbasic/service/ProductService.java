package com.business.shopbasic.service;


import com.business.shopbasic.model.AllProductModel;
import com.business.shopbasic.model.Product;
import com.business.shopbasic.repository.product.ProductRepository;
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

    public List<AllProductModel> getAllProductsList(){
        return productRepository.getAllProducts();
    }
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(String productId){
        Product product = getProductById(productId);
        if(product != null && product.getProductId().equalsIgnoreCase(productId)){
            productRepository.passivate(productId);
        }
    }


}

