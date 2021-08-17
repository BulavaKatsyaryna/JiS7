package com.example.springboot.creditCard.web.converter;

import com.example.springboot.creditCard.model.CreditCard;
import com.example.springboot.creditCard.web.dto.CreditCardResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreditCardWebConverter {

    private ModelMapper modelMapper;

    public CreditCardResponse toResponse(CreditCard creditCard) {
        return modelMapper.map(creditCard, CreditCardResponse.class);
    }
}
