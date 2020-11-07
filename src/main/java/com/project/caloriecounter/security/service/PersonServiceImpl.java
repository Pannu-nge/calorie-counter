package com.project.caloriecounter.security.service;

import com.project.caloriecounter.model.Person;
import com.project.caloriecounter.repository.PersonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getAll(){ return personRepository.findAll(); }
    @Override
    public Person getById(Long id){
        return personRepository.getOne(id);
    }
    @Override
    public Person create(Person person){
        return personRepository.save(person);
    }
    @Override
    public Person update(Person person){
        Person oldPerson = personRepository.getOne(person.getId());
        BeanUtils.copyProperties(person, oldPerson, "id", "mealLogs", "account");
        return personRepository.saveAndFlush(oldPerson);
    }


}
