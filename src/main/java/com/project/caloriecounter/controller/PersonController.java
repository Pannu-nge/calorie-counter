package com.project.caloriecounter.controller;

import com.project.caloriecounter.model.Person;
import com.project.caloriecounter.repository.PersonRepository;
import com.project.caloriecounter.service.PersonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAll(){ return personService.getAll(); }
    @GetMapping("{id}")
    public Person getById(@PathVariable Long id){
        return personService.getById(id);
    }
    @PostMapping
    public Person create(@RequestBody Person person){
        return personService.create(person);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Person update(@RequestBody Person person){
        return personService.update(person);
    }
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long personId){
        personService.deleteById(personId);
    }

}
