package com.annotationstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAppDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        AudiA5 myAudi = context.getBean("MyAudi", AudiA5.class);
        System.out.println("Car owner: " + myAudi.getOwnerName());
        System.out.println("Car numberID: " + myAudi.getCarNumber());
        System.out.println(myAudi.getDailyFuelExpenses());
        System.out.println(myAudi.getEngineInformation());

    }
}
