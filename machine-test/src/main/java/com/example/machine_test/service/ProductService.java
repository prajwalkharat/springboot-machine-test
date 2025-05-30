package com.example.machine_test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.machine_test.entity.Product;
import com.example.machine_test.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public Page<Product> getAll(int page) {
        return productRepo.findAll(PageRequest.of(page, 5));
    }

    public Product create(Product product) {
        return productRepo.save(product);
    }

    public Optional<Product> get(Long id) {
        return productRepo.findById(id);
    }

    public Product update(Long id, Product product) {
        product.setId(id);
        return productRepo.save(product);
    }

    public void delete(Long id) {
        productRepo.deleteById(id);
    }
}
