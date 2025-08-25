package com.learn.JpaMappings.OneToMany.repo;

import com.learn.JpaMappings.OneToMany.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
