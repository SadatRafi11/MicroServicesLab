package com.example.productService.services;

import com.example.productService.entities.Product;
import com.example.productService.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findProduct(String productId) {
        return productRepository.findProductById(productId);
    }
}
