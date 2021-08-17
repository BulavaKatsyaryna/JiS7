package com.example.springboot.creditCard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardParam {

    private Long id;
    private String cardNumber;
    private String bankName;
    private BigDecimal founds;
}
