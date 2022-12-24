package com.business.shopbasic.controller;

import com.business.shopbasic.Constants.HttpConstants;
import com.business.shopbasic.model.AllProductModel;
import com.business.shopbasic.model.Product;
import com.business.shopbasic.model.ProductForm;
import com.business.shopbasic.model.ProductFormItems;
import com.business.shopbasic.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductsController {


    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public ResponseEntity<List<AllProductModel>> getProducts(){

        List<AllProductModel> productList = productService.getAllProductsList();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpConstants.COUNT, String.valueOf(productList.size()));
        return ResponseEntity.ok().headers(headers).body(productList);
    }

    @GetMapping("/form")
    public ResponseEntity<ProductFormItems> getProductFormItems(){

        ProductFormItems productList = productService.getProductFormItems();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpConstants.COUNT, String.valueOf(1));
        return ResponseEntity.ok().headers(headers).body(productList);
    }

    @GetMapping("/full")
    public ResponseEntity<List<Product>> getNewProductOptions(){

        List<Product> productList = productService.getAllProducts();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpConstants.COUNT, String.valueOf(productList.size()));
        return ResponseEntity.ok().headers(headers).body(productList);
    }

    @PostMapping("")
    public ResponseEntity<Product> addProducts(@RequestBody ProductForm form){

        Product product = new Product();
        product.setActiveFlag(true);
        product.setName(form.getName());
        product.setProductCategory(productService.getProductCategoryById(form.getCategoryId()));
        product.setManufacturer(productService.getManufacturerById(form.getManufacturerId()));
        product.setCreateTime(new Timestamp(System.currentTimeMillis()));
        product.setRevisionTime(new Timestamp(System.currentTimeMillis()));
        product.setDescription(form.getDescription());
        Product updatedProduct = productService.saveProduct(product);
        HttpHeaders headers = new HttpHeaders();
        return ResponseEntity.accepted().headers(headers).body(updatedProduct);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateProducts(@RequestBody Product product){

        Product updatedProduct = productService.saveProduct(product);
        HttpHeaders headers = new HttpHeaders();
        return ResponseEntity.accepted().headers(headers).body(updatedProduct);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteProducts(@RequestParam String id){

        productService.deleteProduct(id);
        HttpHeaders headers = new HttpHeaders();
        return ResponseEntity.accepted().headers(headers).body("product deleted");
    }

}

