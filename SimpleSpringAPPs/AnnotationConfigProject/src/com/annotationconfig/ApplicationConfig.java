package com.annotationconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Soldier solderBoy = context.getBean("soldier", Soldier.class);
        System.out.println(solderBoy.getName());
        System.out.println(solderBoy.getAge());
        System.out.println(solderBoy.getJob());
        System.out.println(solderBoy.getFortuneService());
    }

}
