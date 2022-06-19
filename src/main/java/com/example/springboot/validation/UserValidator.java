package com.example.springboot.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserValidator implements ConstraintValidator<UserConstraint, String> {
    @Override
    public void initialize(UserConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value,
                           ConstraintValidatorContext cxt) {
        return value != null;
    }
}
