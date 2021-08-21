package com.example.springboot.creditCard.service;

import com.example.springboot.creditCard.dto.CreditCardParam;
import com.example.springboot.creditCard.model.CreditCard;

import java.util.Collection;

public interface CreditCardService {

    CreditCard create(CreditCardParam creditCardParam);

    Collection<CreditCard> findAll();
}
