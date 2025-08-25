package com.learn.JpaMappings.OneToMany.controller;

import com.learn.JpaMappings.OneToMany.entity.Address;
import com.learn.JpaMappings.OneToMany.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService service;

    @PostMapping
    public ResponseEntity<Address> addAddress(@RequestBody Address address) {
        Address savedAddress = service.add(address);
        return new ResponseEntity<>(savedAddress, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Address>> getAllAddress() {
        List<Address> allAddresses = service.fetchAllAddresses();
        return ResponseEntity.ok(allAddresses);
    }
}