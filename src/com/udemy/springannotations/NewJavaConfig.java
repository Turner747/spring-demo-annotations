package com.udemy.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewJavaConfig {

    @Bean
    public FortuneService madFortuneService(){
        return new MadFortune();
    }

    @Bean
    public Coach footballCoach(){
        return new FootballCoach(madFortuneService());
    }
}
