package address.service;

import address.entity.AddressEntity;

public interface AddressService {

    AddressEntity create(String city, String country, String homeHumber, String street);
}
