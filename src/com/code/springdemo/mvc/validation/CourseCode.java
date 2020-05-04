package com.code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode 
{
	//Define Default Course Code Attributes
	public String value() default "LUV";
	//Define Default Error Message
	public String message() default "must start with LUV";
	//Define Default Groups
	public Class<?>[] groups() default {};
	//Define Default Payloads
	public Class<? extends Payload>[] payload() default {};

}
