package com.example.springboot.address.service;

import com.example.springboot.address.entity.AddressEntity;

public interface AddressService {

    AddressEntity create(String city, String country, String homeHumber, String street);
}
