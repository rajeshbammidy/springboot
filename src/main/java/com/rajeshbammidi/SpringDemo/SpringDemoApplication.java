package com.rajeshbammidi.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * To component scan the other packages use the below
 *
 * @SpringBootApplication(scanBasePackageClasses = {"com.rajeshbammidi.util"})
 */

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
