package com.annotationconfig;

import org.springframework.beans.factory.annotation.Value;

public class Dentist implements Man {

    @Value("${dentist.name}")
    private String name;
    @Value("${dentist.age}")
    private int age;
    private FortuneService fortune;

    public Dentist(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getJob() {
        return "Dentist";
    }

    @Override
    public String getFortuneService() {
        return fortune.getFortune();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
