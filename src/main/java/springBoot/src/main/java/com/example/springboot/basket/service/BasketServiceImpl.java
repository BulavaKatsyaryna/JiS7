package com.example.springboot.basket.service;

import com.example.springboot.basket.entity.BasketEntity;
import com.example.springboot.basket.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketRepository basketRepository;

    @Override
    public BasketEntity create() {
        return basketRepository.save(new BasketEntity());
    }
}
