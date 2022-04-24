package com.example.sample.controller;

import com.example.sample.model.entity.Person;
import com.example.sample.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @GetMapping("/test")
    public String test1() {
        return "test";
    }

    @GetMapping("/gettest/{id}")
    public Object select(@PathVariable(name = "id") String id) {
        System.out.println("id : "+ id);
        Object personList = service.selectPerson(id);
        return personList;
    }

    //insert
    @PostMapping("/posttest")
    //@RequestMapping("/posttest")
    public String test2(@RequestBody Person p) {
        Person person = service.insertPerson(p);
        return "성공성공";
    }

    @PutMapping("/puttest")
    public String test3() {
        return "test3";
    }


}
