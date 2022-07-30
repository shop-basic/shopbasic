package com.business.shopbasic.controller;

import com.business.shopbasic.model.Product;
import com.business.shopbasic.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {


    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public ResponseEntity<List<Product>> getProducts(){

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
