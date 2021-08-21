package com.example.springboot.creditCard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "credit_cards")
@AllArgsConstructor
public class CreditCardEntity {

    public static final int MIN_CARD_NUMBER = 16;
    public static final int MAX_CARD_NUMBER = 19;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = MIN_CARD_NUMBER, max = MAX_CARD_NUMBER)
    private String cardNumber;

    @NotNull
    private String bankName;

    @NotNull
    private BigDecimal founds;
}
