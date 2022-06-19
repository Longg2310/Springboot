package com.example.springboot.validation;

import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldsValueMatchValidator implements ConstraintValidator<FieldsValueMatch, Object> {

    private String field;
    private String fieldMatch;

    public void initialize(FieldsValueMatch constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    public boolean isValid(Object value,
                           ConstraintValidatorContext context) {

        String fieldValue = (String) new BeanWrapperImpl(value)
                .getPropertyValue(field);
        String fieldMatchValue = (String) new BeanWrapperImpl(value)
                .getPropertyValue(fieldMatch);

        if(fieldValue != null && fieldMatchValue != null){
            return fieldValue.equals(fieldMatchValue);
        }
        else {
            return false;
        }
    }
}
