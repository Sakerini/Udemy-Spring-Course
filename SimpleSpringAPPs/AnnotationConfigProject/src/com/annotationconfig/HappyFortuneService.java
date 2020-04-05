package com.annotationconfig;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Lucky day";
    }
}
