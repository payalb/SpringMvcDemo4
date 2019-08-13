package om.java.dto;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<ValidDate, LocalDate> {

	LocalDate maxDate;
	@Override
	public void initialize(ValidDate constraintAnnotation) {
		String maxValue=constraintAnnotation.max();
		maxDate=LocalDate.parse(maxValue);
	}

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		if (value.isBefore(maxDate)) {
			return true;
		} else {
			return false;
		}
	}

}
