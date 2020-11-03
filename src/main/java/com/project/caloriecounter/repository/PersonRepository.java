package com.project.caloriecounter.repository;

import com.project.caloriecounter.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
