package com.guilhermeborges.auth.domain;

import com.guilhermeborges.auth.dtos.ProductDTO;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String price;

    public Product(ProductDTO productDTO) {
        this.description = productDTO.description();
        this.price = productDTO.price();
    }
}
