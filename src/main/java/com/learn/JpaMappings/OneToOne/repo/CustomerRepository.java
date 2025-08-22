package com.learn.JpaMappings.OneToOne.repo;

import com.learn.JpaMappings.OneToOne.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
