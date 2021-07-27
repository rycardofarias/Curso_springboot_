package com.rycardofarias.com.backend.repositories;

import com.rycardofarias.com.backend.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
