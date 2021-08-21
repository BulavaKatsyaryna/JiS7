package com.example.springboot.creditCard.service;

import com.example.springboot.creditCard.dto.CreditCardParam;
import com.example.springboot.creditCard.model.CreditCard;
import com.example.springboot.creditCard.repository.CreditCardRepository;
import com.example.springboot.creditCard.service.converter.CreditCardEntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardRepository creditCardRepository;
    private final CreditCardEntityConverter creditCardEntityConverter;

    @Override
    @Transactional
    public CreditCard create(CreditCardParam creditCardParam) {
        var creditCard = creditCardEntityConverter.toModel(creditCardParam);

        var creditCardEntity = creditCardEntityConverter.toEntity(creditCard);

        var savedCreditCard = creditCardRepository.save(creditCardEntity);

        return creditCardEntityConverter.fromEntityToModel(savedCreditCard);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<CreditCard> findAll() {
        return creditCardRepository.findAll().stream()
                .filter(it -> !it.getId().equals(1L))
                .map(creditCardEntityConverter::fromEntityToModel)
                .collect(Collectors.toSet());
    }
}
