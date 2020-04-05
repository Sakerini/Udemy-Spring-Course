package com.annotationconfig;


import org.springframework.beans.factory.annotation.Value;

public class Soldier implements Man {

    @Value("${soldier.name}")
    private String name;
    @Value("${soldier.age}")
    private int age;
    private FortuneService fortune;

    public Soldier(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getJob() {
        return "Soldier";
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
