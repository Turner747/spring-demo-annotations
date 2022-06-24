package com.udemy.springannotations;

import org.springframework.beans.factory.annotation.Value;

public class BaseballCoach implements Coach{

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Face 1000 pitches from the pitching machine";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
