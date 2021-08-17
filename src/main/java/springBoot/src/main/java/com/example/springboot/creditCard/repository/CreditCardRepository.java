package com.example.springboot.creditCard.repository;

import com.example.springboot.creditCard.entity.CreditCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardEntity, Long> {
}
