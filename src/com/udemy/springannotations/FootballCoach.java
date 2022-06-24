package com.udemy.springannotations;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "do 100 push ups";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
