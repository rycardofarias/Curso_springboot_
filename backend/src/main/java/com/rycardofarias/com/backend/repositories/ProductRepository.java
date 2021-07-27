package com.rycardofarias.com.backend.repositories;

import com.rycardofarias.com.backend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
