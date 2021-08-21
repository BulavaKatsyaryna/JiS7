package com.example.springboot.creditCard.web.converter;

import com.example.springboot.creditCard.model.CreditCard;
import com.example.springboot.creditCard.web.dto.CreditCardResponse;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Component
@RequiredArgsConstructor
public class CreditCardWebConverter {

    private ModelMapper modelMapper;

    public CreditCardResponse toResponse(CreditCard creditCard) {
        var creditCardResponse = modelMapper.map(creditCard, CreditCardResponse.class);
        if (creditCardResponse.getFounds().compareTo(BigDecimal.ZERO) < 0) {
            creditCardResponse.setHasUserIndebtedness(true);
        }
        return creditCardResponse;
    }
}
