package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManagerFactory;


@SpringBootApplication
public class JpaTestApplication {

    public static void main(String[] args) {


        SpringApplication.run(JpaTestApplication.class, args);
    }

}

