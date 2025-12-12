package com.example.day1.service;

import com.example.day1.model.Product;
import com.example.day1.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> all() {
        return repo.findAll();
    }

    public Optional<Product> findById(Long id) {
        return repo.findById(id);
    }

    public Product create(Product p) {
        // Simple domain rule example: do not allow duplicate SKU
        if (p.getSku() != null && repo.existsBySku(p.getSku())) {
            throw new IllegalArgumentException("SKU already exists: " + p.getSku());
        }
        return repo.save(p);
    }

    public Product update(Long id, Product update) {
        return repo.findById(id).map(existing -> {
            existing.setName(update.getName());
            existing.setSku(update.getSku());
            existing.setPrice(update.getPrice());
            return repo.save(existing);
        }).orElseThrow(() -> new IllegalArgumentException("Product not found: " + id));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
