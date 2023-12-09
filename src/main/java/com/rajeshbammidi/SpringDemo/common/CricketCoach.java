package com.rajeshbammidi.SpringDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // to make it primary bean, if there is no qualifier given
public class CricketCoach implements Coach {

    CricketCoach(){
        System.out.println("CricketCoach  Cons");
    }

    @Override
    public String getWorkOut() {
        return "Let paly cricker";
    }
}
