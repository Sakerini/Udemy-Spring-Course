package com.sakerini.registrationformdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class RegistrationformdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationformdemoApplication.class, args);
    }

}
