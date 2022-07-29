package com.business.shopbasic.controller;

import com.business.shopbasic.model.Product;
import com.business.shopbasic.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {


    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){

        List<Product> productList = productService.getAllProducts();
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "text/json");
        headers.add("count", String.valueOf(productList.size()));
        return ResponseEntity.ok().headers(headers).body(productList);
    }
}
