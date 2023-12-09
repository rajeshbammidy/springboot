package com.rajeshbammidi.SpringDemo.rest;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getWorkOut() {
        return "Let paly cricker";
    }
}
