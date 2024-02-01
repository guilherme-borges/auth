package com.guilhermeborges.auth.services;

import com.guilhermeborges.auth.domain.Product;
import com.guilhermeborges.auth.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product create(Product product) {
        return this.repository.save(product);
    }

    public List<Product> getAll() {
        return this.repository.findAll();
    }
}
