package com.example.springboot.creditCard.web.controller;

import com.example.springboot.creditCard.dto.CreditCardParam;
import com.example.springboot.creditCard.service.CreditCardService;
import com.example.springboot.creditCard.web.converter.CreditCardWebConverter;
import com.example.springboot.creditCard.web.dto.CreditCardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/credit-cards")
@Validated
@RequiredArgsConstructor
public class CreditCardController {

    private final CreditCardService creditCardService;
    private final CreditCardWebConverter creditCardWebConverter;

    @PostMapping
    @NotNull
    public CreditCardResponse create (@Valid @NotNull @RequestBody CreditCardParam creditCardParam) {
        var creditCard = creditCardService.create(creditCardParam);
        return creditCardWebConverter.toResponse(creditCard);
    }

    @NotNull
    @GetMapping
    public Collection<CreditCardResponse> findAll() {
        return creditCardService.findAll().stream()
        .map(creditCardWebConverter::toResponse)
        .collect(Collectors.toSet());
    }
}
