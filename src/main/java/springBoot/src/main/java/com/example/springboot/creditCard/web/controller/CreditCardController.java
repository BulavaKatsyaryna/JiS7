package com.example.springboot.creditCard.web.controller;

import com.example.springboot.creditCard.dto.CreditCardParam;
import com.example.springboot.creditCard.service.CreditCardService;
import com.example.springboot.creditCard.web.converter.CreditCardWebConverter;
import com.example.springboot.creditCard.web.dto.CreditCardResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/credit-cards")
public class CreditCardController {

    private CreditCardService creditCardService;
    private CreditCardWebConverter creditCardWebConverter;

    public CreditCardResponse create (@RequestBody CreditCardParam creditCardParam) {
        var creditCard = creditCardService.create(creditCardParam);
        return creditCardWebConverter.toResponse(creditCard);
    }
}
