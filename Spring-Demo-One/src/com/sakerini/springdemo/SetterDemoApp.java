package com.sakerini.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get beans from container
        VolleyballCoach volleyballCoach =  context.getBean("VolleyCoach", VolleyballCoach.class);
        // call bean's methods

        System.out.println("Email: " + volleyballCoach.getEmailAdress());
        System.out.println("Team: " + volleyballCoach.getTeamName());
        System.out.println("VolleyCoach work time: " + volleyballCoach.getDailyWorkTime());
        System.out.println("VolleyCoach fortune: " + volleyballCoach.getDailyFortune());

        // close context
        context.close();
    }
}
