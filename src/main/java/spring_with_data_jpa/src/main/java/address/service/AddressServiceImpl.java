package address.service;

import address.entity.AddressEntity;
import address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    @Transactional
    public AddressEntity create(String city, String country, String homeHumber, String street) {
        var address = new AddressEntity();
        address.setCity(city);
        address.setCountry(country);
        address.setHomeNumber(homeHumber);
        address.setStreet(street);
        return addressRepository.save(address);
    }
}
