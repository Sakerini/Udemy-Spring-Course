package com.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:people.properties")
public class Config {

    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public FortuneService badFortuneService() {
        return new BadFortuneService();
    }

    @Bean
    public Soldier soldier() {
        return new Soldier(happyFortuneService());
    }

    @Bean
    public Dentist dentist() {
        return new Dentist(badFortuneService());
    }
}
