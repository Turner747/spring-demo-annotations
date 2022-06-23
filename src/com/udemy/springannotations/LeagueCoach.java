package com.udemy.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LeagueCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
    public LeagueCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Do 3 laps of the field";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
