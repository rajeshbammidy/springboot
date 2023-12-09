package com.rajeshbammidi.SpringDemo.rest;

import com.rajeshbammidi.SpringDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController to enable rest functionalities
//  @Autowired constructor injection is here
//@Qualifier to identify the bean using abs factory.

@RestController
public class MyRestController {

    private Coach coach;
    private Coach anotherCoach;

    @Autowired
        // it is option when we have one constructor

    MyRestController(@Qualifier("baseBallCoach") Coach coach, @Qualifier("baseBallCoach") Coach anotherCoach) {
        System.out.println("MyRestController  cons");
        //constructor injection
        this.coach = coach;
        this.anotherCoach = anotherCoach;
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
        return this.coach.getWorkOut() + " " + (anotherCoach == coach);
    }
}
