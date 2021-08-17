package com.example.springboot.creditCard.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardResponse {

    private Long id;
    private String cardNumber;
    private String bankName;
    private BigDecimal founds;
    private boolean hasUserIndebtedness;
}
