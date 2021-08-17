package com.example.springboot.creditCard.service;

import com.example.springboot.creditCard.dto.CreditCardParam;
import com.example.springboot.creditCard.model.CreditCard;
import com.example.springboot.creditCard.repository.CreditCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardRepository creditCardRepository;

    @Override
    @Transactional
    public CreditCard create(CreditCardParam creditCardParam) {
//        var creditCard = new CreditCardEntity();
//        creditCard.setBankName(bankName);
//        creditCard.setCardNumber(cardNumber);
//        creditCard.setFounds(founds);
//        return creditCardRepository.save(creditCard);
        return null;
    }
}
