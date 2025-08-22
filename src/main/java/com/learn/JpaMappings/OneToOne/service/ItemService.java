package com.learn.JpaMappings.OneToOne.service;

import com.learn.JpaMappings.OneToOne.entity.Item;
import com.learn.JpaMappings.OneToOne.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> fetchAllItems() {
        return itemRepository.findAll();
    }

    public Item add(Item item) {
        return itemRepository.save(item);
    }
}