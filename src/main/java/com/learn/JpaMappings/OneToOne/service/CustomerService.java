package com.learn.JpaMappings.OneToOne.service;

import com.learn.JpaMappings.OneToOne.entity.Customer;
import com.learn.JpaMappings.OneToOne.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> fetchAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> findById(Integer customerId) {
        return customerRepository.findById(customerId);
    }

    public String deleteById(Integer customerId) {
        String result = "Customer with ID: %d ";
        Customer customer = findById(customerId).orElse(null);
        if (customer != null) {
            customerRepository.deleteById(customerId);
            result = String.format(result + "deleted successfully", customerId);
        } else
            result = String.format(result + "not found !", customerId);
        return result;
    }
}
