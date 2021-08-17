package com.example.springboot.customer.service;

import com.example.springboot.address.repository.AddressRepository;
import com.example.springboot.basket.repository.BasketRepository;
import com.example.springboot.creditCard.repository.CreditCardRepository;
import com.example.springboot.customer.entity.CustomerEntity;
import com.example.springboot.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    @Transactional
    public CustomerEntity create(String firstName, String lastName, String userName, String email, String password,
                                 Long addressId, Long basketId, Collection<Long> creditCardIds) {

        log.info("Creating customer");

        var customerAddress = addressRepository.findById(addressId)
                .orElseThrow(() -> new EntityNotFoundException("Cannot find address with id " + addressId));
        var customerBasket = basketRepository.findById(basketId)
                .orElseThrow(() -> new EntityNotFoundException("Cannot find basket with id " + basketId));
        var customerCreditCard= creditCardRepository.findAll().stream()
                .filter(creditCardIds::contains)
                .collect(Collectors.toSet());
        var customer = CustomerEntity.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .address(customerAddress)
                .basket(customerBasket)
                .creditCard(customerCreditCard)
                .userName(userName)
                .password(password)
                .build();

        var saveCustomer =  customerRepository.save(customer);

        log.info("Customer with id " + saveCustomer.getId() + " has been successfully saved");

        return saveCustomer;
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existCustomer(Long id, String userName, Long basketId) {
        return customerRepository.existsByIdAndUserNameLikeAndAddressIsNotNullAndBasketId(id, userName, basketId );
    }

    @Override
    @Transactional(readOnly = true)
    public CustomerEntity findByName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }
}
