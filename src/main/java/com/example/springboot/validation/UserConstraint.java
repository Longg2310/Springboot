package com.example.springboot.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UserValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserConstraint {

    String message() default "{name.notempty}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
