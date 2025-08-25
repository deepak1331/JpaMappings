package com.learn.JpaMappings.OneToMany.controller;

import com.learn.JpaMappings.OneToMany.entity.Person;
import com.learn.JpaMappings.OneToMany.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        Person person1 = service.add(person);
        return new ResponseEntity<>(person1, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> allPeople = service.fetchAllPersons();
        return ResponseEntity.ok(allPeople);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{personId}")
    public ResponseEntity<String> deleteById(@PathVariable Integer personId) {
        return ResponseEntity.ok(service.deleteById(personId));
    }
}