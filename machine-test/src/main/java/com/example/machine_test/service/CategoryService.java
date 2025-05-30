package com.example.machine_test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.machine_test.entity.Category;
import com.example.machine_test.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Page<Category> getAll(int page) {
        return repo.findAll(PageRequest.of(page, 5));
    }

    public Category create(Category category) {
        return repo.save(category);
    }

    public Optional<Category> get(Long id) {
        return repo.findById(id);
    }

    public Category update(Long id, Category category) {
        category.setId(id);
        return repo.save(category);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
