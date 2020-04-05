package com.sakerini.springdemo;

public class BasketCoach implements Coach {

    private FortuneService fortuneService;

    public BasketCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkTime() {
        return "Worked 30 minutes with bats";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
