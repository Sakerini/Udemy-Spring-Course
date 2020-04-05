package com.sakerini.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach basketCoach = context.getBean("BasketCoach", Coach.class);
        Coach footballCoach = context.getBean("FootballCoach", Coach.class);

        //call methods on the bean
        System.out.println("Basket:");
        System.out.println(basketCoach.getDailyWorkTime());
        System.out.println("Fortune:" + basketCoach.getDailyFortune());

        System.out.println("Football:");
        System.out.println(footballCoach.getDailyWorkTime());
        System.out.println("Fortune:" + footballCoach.getDailyFortune());



        //close the context
        context.close();
    }
}
