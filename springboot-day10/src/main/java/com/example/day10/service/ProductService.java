package com.example.day10.service;

import com.example.day10.entity.Product;
import com.example.day10.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public Page<Product> getProducts(String category, Pageable pageable) {

        if (category != null && !category.isBlank()) {
            return repository.findByCategory(category, pageable);
        }

        return repository.findAll(pageable);
    }
}
