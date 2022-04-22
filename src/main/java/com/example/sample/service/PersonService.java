package com.example.sample.service;

import com.example.sample.model.entity.Person;
import com.example.sample.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person insertPerson(Person p) {
        Person person =  personRepository.save(p);

        //여기다가 셋값을 넣으라고...
        return person;
    }

    public Object selectPerson() {
        Iterable<Person> personList = personRepository.findAll();
        return personList;
    }
}
