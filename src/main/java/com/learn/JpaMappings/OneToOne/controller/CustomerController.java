package com.learn.JpaMappings.OneToOne.controller;

import com.learn.JpaMappings.OneToOne.entity.Customer;
import com.learn.JpaMappings.OneToOne.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer cust = service.add(customer);
        return new ResponseEntity<>(cust, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> allCustomers = service.fetchAllCustomers();
        return ResponseEntity.ok(allCustomers);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{customerId}")
    public ResponseEntity<String> deleteById(@PathVariable Integer customerId) {
        return ResponseEntity.ok(service.deleteById(customerId));
    }
}