package com.rajeshbammidi.SpringDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // to create a new instance everytime you use DI
public class BaseBallCoach implements Coach {
    BaseBallCoach() {
        System.out.println("BaseBallCoach  Cons");
    }

    @PostConstruct
    void afterCons(){
        System.out.println("Okay after cons");
    }

    @Override
    public String getWorkOut() {
        return "BaseBallCoach is me";
    }

    @PreDestroy
    void preDest(){
        System.out.println("Okay Im pre destory");
    }
}
