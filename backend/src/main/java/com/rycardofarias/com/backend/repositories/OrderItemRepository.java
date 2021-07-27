package com.rycardofarias.com.backend.repositories;

import com.rycardofarias.com.backend.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
