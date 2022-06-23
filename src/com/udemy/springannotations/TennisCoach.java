package com.udemy.springannotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component //("thatSillyCoach")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService){
       this.fortuneService = fortuneService;
    }*/

    public TennisCoach(){
        System.out.println("Object constructor: TennisCoach");
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Init method: doMyStartupStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Destroy method: doMyCleanupStuff");
    }

    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter method: fortuneService");
        this.fortuneService = fortuneService;
    }

    @Autowired
    public void doRandomStuff(FortuneService fortuneService) {
        System.out.println("Method: doRandomStuff");
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
