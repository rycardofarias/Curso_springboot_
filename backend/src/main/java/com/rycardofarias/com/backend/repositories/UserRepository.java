package com.rycardofarias.com.backend.repositories;

import com.rycardofarias.com.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
