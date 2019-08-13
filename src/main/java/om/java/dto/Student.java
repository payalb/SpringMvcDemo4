package om.java.dto;
//data transfer object
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Student {
	{
		count++;
		id=count;
	}
	static int count;
	int id;
	String name;
	int age;
	LocalDate dob;
	char gender;
	List<String> subjects= new ArrayList<>();
	Address address;
}