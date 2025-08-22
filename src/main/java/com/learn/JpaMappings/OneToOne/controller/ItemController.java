package com.learn.JpaMappings.OneToOne.controller;

import com.learn.JpaMappings.OneToOne.entity.Item;
import com.learn.JpaMappings.OneToOne.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService service;

    @PostMapping
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        Item savedItem = service.add(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> allItems = service.fetchAllItems();
        return ResponseEntity.ok(allItems);
    }
}