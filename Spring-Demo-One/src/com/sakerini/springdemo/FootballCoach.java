package com.sakerini.springdemo;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkTime() {
        return "working time on the football pitch 2 hours a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
