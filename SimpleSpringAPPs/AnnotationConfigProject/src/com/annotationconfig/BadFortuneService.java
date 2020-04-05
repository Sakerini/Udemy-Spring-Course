package com.annotationconfig;

public class BadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Bad Luck";
    }

}
