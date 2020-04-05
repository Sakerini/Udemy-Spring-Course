package com.sakerini.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private List<FortuneService> fortunes;
    private Random randomGenerator = new Random();

    public void setFortunes(List<FortuneService> fortunes) {
        this.fortunes = fortunes;
    }

    @Override
    public String getFortune() {
        return fortunes.get(randomGenerator.nextInt(fortunes.size())).getFortune();
    }
}
