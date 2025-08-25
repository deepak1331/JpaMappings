package com.learn.JpaMappings.OneToMany.service;

import com.learn.JpaMappings.OneToMany.entity.Person;
import com.learn.JpaMappings.OneToMany.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> fetchAllPersons() {
        return personRepository.findAll();
    }

    public Person add(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> findById(Integer personId) {
        return personRepository.findById(personId);
    }

    public String deleteById(Integer personId) {
        String result = "Person with ID: %d ";
        Person person = findById(personId).orElse(null);
        if (person != null) {
            personRepository.deleteById(personId);
            result = String.format(result + "deleted successfully", personId);
        } else
            result = String.format(result + "not found !", personId);
        return result;
    }
}
