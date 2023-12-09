package com.rajeshbammidi.SpringDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    private Coach coach;

    @Autowired
        // it is option when we have one constructor
    MyRestController(Coach coach) {
        //constructor injection
        this.coach = coach;
    }

    //To read from the properties
    @Value("${coach.name}")
    private String name;

    @GetMapping("/")
    public String sayHello() {
        return name;
    }

    @GetMapping("/workout")
    public String workout() {
        return this.coach.getWorkOut();
    }
}
