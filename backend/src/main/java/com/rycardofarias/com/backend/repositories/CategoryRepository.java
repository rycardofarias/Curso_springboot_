package com.rycardofarias.com.backend.repositories;

import com.rycardofarias.com.backend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
