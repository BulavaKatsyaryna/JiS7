package com.example.springboot.creditCard.service.converter;

import com.example.springboot.creditCard.dto.CreditCardParam;
import com.example.springboot.creditCard.entity.CreditCardEntity;
import com.example.springboot.creditCard.model.CreditCard;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreditCardEntityConverter {

    private final ModelMapper modelMapper;

    public CreditCard toModel(CreditCardParam creditCardParam) {
        return modelMapper.map(creditCardParam, CreditCard.class);
    }

    public CreditCardEntity toEntity(CreditCard creditCard) {
        return modelMapper.map(creditCard, CreditCardEntity.class);
    }

    public CreditCard fromEntityToModel(CreditCardEntity creditCardEntity) {
        return modelMapper.map(creditCardEntity, CreditCard.class);
    }
}
