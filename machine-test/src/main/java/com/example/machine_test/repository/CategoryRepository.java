package com.example.machine_test.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.machine_test.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}