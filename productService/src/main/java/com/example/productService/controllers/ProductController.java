package com.example.productService.controllers;

import com.example.productService.entities.Product;
import com.example.productService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping
    public Product findProduct(@PathVariable("id") String productId) {
        return productService.findProduct(productId);
    }
}
