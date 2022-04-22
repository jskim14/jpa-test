package com.example.sample.controller;

import com.example.sample.model.entity.Person;
import com.example.sample.repository.PersonRepository;
import com.example.sample.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WebController {

    private final PersonService service;

    @GetMapping("/test")
    public String test1() {
        return "test";
    }

    @GetMapping("/gettest")
    public Object select() {
        Object personList = service.selectPerson();
        return personList;
    }

    //insert
    @PostMapping("/posttest")
    //@RequestMapping("/posttest")
    public String test2(@RequestBody Person p) {
        System.out.println("컨트롤러의 p"+ p);
        Person person = service.insertPerson(p);
        if(person != null) {
            System.out.println("등록이다");
        } else {
            System.out.println("실패다");
        }
//        Person person = pr.save(p);
        System.out.println("save의 person"+p);
        return "성공성공";
    }

    @PutMapping("/puttest")
    public String test3() {
        return "test3";
    }


}
