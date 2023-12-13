package com.example.hourscounter.validate.annotation;


import com.example.hourscounter.exception.ErrorMessage;
import com.example.hourscounter.validate.constraint.ValidUUIDConstraint;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Constraint(validatedBy = ValidUUIDConstraint.class)
public @interface ValidUUID {
    String message() default ErrorMessage.INVALID_UUID_FORMAT;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
