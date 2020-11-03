package com.project.caloriecounter.service;

import com.project.caloriecounter.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAll();
    Person getById(Long id);
    Person create(Person person);
    Person update(Person person);
    void deleteById(Long id);
}
