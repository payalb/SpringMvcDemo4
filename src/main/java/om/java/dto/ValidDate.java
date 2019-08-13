package om.java.dto;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=DateValidator.class)
public @interface ValidDate {
	
	
	String message() default "Date of birth is invalid";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	String max();

}
