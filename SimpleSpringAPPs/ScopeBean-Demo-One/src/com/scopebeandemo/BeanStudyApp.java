package com.scopebeandemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanStudyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanStudy-applicationContext.xml");

        Animal tommy = context.getBean("myCat", Cat.class);
        Animal jerry = context.getBean("myCat", Cat.class);

        boolean result = (tommy == jerry);

        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for tommy: " + tommy);
        System.out.println("Memory location for jerry: " + jerry);

        context.close();
    }
}
