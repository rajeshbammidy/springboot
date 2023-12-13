package com.rajeshbammidi.SpringDemo.config;

import com.rajeshbammidi.SpringDemo.common.Coach;
import com.rajeshbammidi.SpringDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Springboot will go through configuration class and fetches beans
public class SportsConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
