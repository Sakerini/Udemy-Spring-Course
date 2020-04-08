package com.sakerini.validationdemo.entity;

import com.sakerini.validationdemo.validation.Starter;
import lombok.Data;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.constraints.*;

@Data
public class User {

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String accountName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String password;

    @NotNull(message = "is required")
    @Min(value = 18, message = "Must be over 18")
    @Max(value = 100, message = "How are you still alive over 100 years ???")
    private Integer age;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    @Starter
    private String street;

    
}
