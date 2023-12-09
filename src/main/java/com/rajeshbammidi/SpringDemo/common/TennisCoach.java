package com.rajeshbammidi.SpringDemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    TennisCoach() {
        System.out.println("TennisCoach  Cons");
    }

    @Override
    public String getWorkOut() {
        return "TennisCoach is me";
    }
}
