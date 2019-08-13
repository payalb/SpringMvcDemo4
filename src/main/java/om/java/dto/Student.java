package om.java.dto;
//data transfer object
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data

public class Student {
	{
		count++;
		id=count;
	}
	static int count;
	@Min(value=1, message="Id should be greater than or equal to 1")
	int id;
	@Size(min=3, max=25,message="Name should be between 3 and 25 char")
	String name;
	@Min(value=15, message="age should not be less than 15")
	int age;
	@ValidDate(max="1985-11-11",message="Invalid dob, dob cannot be more than 1985-11-11")
	LocalDate dob;
	char gender;
	@NotEmpty(message="subjects cannot be empty")
	List<String> subjects= new ArrayList<>();
	@NotNull(message="address cannot be null")
	Address address;
}