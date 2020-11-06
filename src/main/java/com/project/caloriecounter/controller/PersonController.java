package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.Person;
import com.project.caloriecounter.security.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Person> getAll(){ return personService.getAll(); }
    @GetMapping("{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Person getById(@PathVariable Long id){
        return personService.getById(id);
    }
    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public Person create(@RequestBody Person person){
        return personService.create(person);
    }
    @RequestMapping(method = RequestMethod.PUT)
    @PreAuthorize("hasRole('USER')")
    public Person update(@RequestBody Person person){
        return personService.update(person);
    }

}
