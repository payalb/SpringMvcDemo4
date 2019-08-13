package om.java.controller;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

//PropertyEditor: interface

//PropertyEditorSupport: class which has provided default impl for all method
@Component
public class LocalDateEditor extends PropertyEditorSupport {

	// convert string to LocalDate
	@Override
	public void setAsText(String dob) throws IllegalArgumentException {
		LocalDate date = LocalDate.parse(dob);
		setValue(date);
	}

	// convert LocalDate to string
	@Override
	public String getAsText() {
		LocalDate date = (LocalDate) getValue();
		return date.toString();
	}

}
