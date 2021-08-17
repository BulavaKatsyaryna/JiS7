package com.example.springboot.address.repository;

import com.example.springboot.address.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<AddressEntity, Long> {

}
