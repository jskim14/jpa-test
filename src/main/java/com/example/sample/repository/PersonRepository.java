package com.example.sample.repository;

import com.example.sample.model.entity.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Long> {

}
