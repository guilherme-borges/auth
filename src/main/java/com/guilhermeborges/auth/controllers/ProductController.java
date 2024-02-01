package com.guilhermeborges.auth.controllers;

import com.guilhermeborges.auth.domain.Product;
import com.guilhermeborges.auth.dtos.ProductDTO;
import com.guilhermeborges.auth.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductDTO productDTO) {
        Product product = new Product(productDTO);
        Product newProduct = this.service.create(product);
        return ResponseEntity.ok(newProduct);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        List<Product> products = this.service.getAll();
        return ResponseEntity.ok(products);
    }
}
