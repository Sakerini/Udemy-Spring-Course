package com.sakerini.validationdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StarterConstraintValidator
        implements ConstraintValidator<Starter, String> {

    private String prefix;
    @Override
    public void initialize(Starter constraintAnnotation) {
        prefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String enteredText,
                           ConstraintValidatorContext constraintValidatorContext) {

        boolean result = enteredText.startsWith(prefix);

        return result;
    }
}
