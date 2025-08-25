package com.learn.JpaMappings.OneToMany.service;

import com.learn.JpaMappings.OneToMany.entity.Address;
import com.learn.JpaMappings.OneToMany.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> fetchAllAddresses() {
        return addressRepository.findAll();
    }

    public Address add(Address address) {
        return addressRepository.save(address);
    }
}