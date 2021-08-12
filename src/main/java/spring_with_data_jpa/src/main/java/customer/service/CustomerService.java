package customer.service;

import customer.entity.CustomerEntity;

import java.util.Collection;

public interface CustomerService {

    CustomerEntity create(String firstName, String lastName, String userName, String email, String password, Long addressId,
                          Long basketId, Collection<Long> creditCardIds);

    boolean existCustomer(Long id, String userName, Long basketId);
}
