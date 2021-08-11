package creditCard.service;

import creditCard.entity.CreditCardEntity;

import java.math.BigDecimal;

public interface CreditCardService {

    CreditCardEntity create(String bankName, String cardNumber, BigDecimal founds);
}
