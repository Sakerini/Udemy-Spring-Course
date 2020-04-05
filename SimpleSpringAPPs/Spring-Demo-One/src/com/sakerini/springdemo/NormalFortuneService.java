package com.sakerini.springdemo;

public class NormalFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a normal day";
    }
}
