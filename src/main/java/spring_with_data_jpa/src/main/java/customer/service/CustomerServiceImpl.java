package customer.service;

import address.repository.AddressRepository;
import basket.repository.BasketRepository;
import creditCard.repository.CreditCardRepository;
import customer.entity.CustomerEntity;
import customer.repository.CustomerRepository;
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
    public boolean existCustomer(Long id, String userName, Long basketId) {
        return customerRepository.existsByIdAndUserNameLikeAndAddressIsNotNullAndBasketId(id, userName, basketId );
    }
}
