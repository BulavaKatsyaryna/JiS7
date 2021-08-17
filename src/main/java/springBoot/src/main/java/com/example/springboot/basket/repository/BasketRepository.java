package com.example.springboot.basket.repository;

import com.example.springboot.basket.entity.BasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<BasketEntity, Long> {
}
