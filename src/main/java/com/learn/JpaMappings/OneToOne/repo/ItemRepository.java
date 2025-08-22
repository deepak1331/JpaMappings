package com.learn.JpaMappings.OneToOne.repo;

import com.learn.JpaMappings.OneToOne.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
