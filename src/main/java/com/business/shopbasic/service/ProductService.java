package com.business.shopbasic.service;


import com.business.shopbasic.model.AllProductModel;
import com.business.shopbasic.model.Manufacturer;
import com.business.shopbasic.model.Product;
import com.business.shopbasic.model.ProductFormItems;
import com.business.shopbasic.model.config.ProductCategory;
import com.business.shopbasic.repository.product.ManufacturerRepository;
import com.business.shopbasic.repository.product.ProductCategoryRepository;
import com.business.shopbasic.repository.product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private ProductCategoryRepository categoryRepository;
    private ManufacturerRepository manufacturerRepository;

    public ProductService(ProductRepository productRepository, ProductCategoryRepository productCategoryRepository,
                          ManufacturerRepository productManufacturerRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = productCategoryRepository;
        this.manufacturerRepository = productManufacturerRepository;

    }

    public ProductCategory getProductCategoryById(String categoryId) {
        return categoryRepository.getById(categoryId);
    }

    public Manufacturer getManufacturerById(String manufacturerId) {
        return manufacturerRepository.getById(manufacturerId);
    }
    public Product getProductById(String productId) {
        return productRepository.getById(productId);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductFormItems getProductFormItems() {

        List<ProductCategory> categories = categoryRepository.findAll();
        List<Manufacturer> manufacturers = manufacturerRepository.findAll();

        return new ProductFormItems(manufacturers, categories);
    }

    public List<AllProductModel> getAllProductsList() {
        return productRepository.getAllProducts();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String productId) {
        Product product = getProductById(productId);
        if (product != null && product.getProductId().equalsIgnoreCase(productId)) {
            productRepository.passivate(productId);
        }
    }


}

