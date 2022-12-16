package com.business.shopbasic.controller;

import com.business.shopbasic.model.AllProductModel;
import com.business.shopbasic.model.Product;
import com.business.shopbasic.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

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
        headers.add("count", String.valueOf(productList.size()));
        //TODO remove this header
        headers.add("Access-Control-Allow-Origin", "http://localhost:4200");
        return ResponseEntity.ok().headers(headers).body(productList);
    }

    @GetMapping("/full")
    public ResponseEntity<List<Product>> getProductsFullList(){

        List<Product> productList = productService.getAllProducts();
        HttpHeaders headers = new HttpHeaders();
        headers.add("count", String.valueOf(productList.size()));
        return ResponseEntity.ok().headers(headers).body(productList);
    }

    @PostMapping("")
    public ResponseEntity<Product> addProducts(@RequestBody Product product){

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
