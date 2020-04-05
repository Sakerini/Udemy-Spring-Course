package com.sakerini.springdemo;

public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAdress;
    private String teamName;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String getDailyWorkTime() {
        return "working 3 hours and a run!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
