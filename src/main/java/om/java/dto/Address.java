package om.java.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class Address {
	@Min(value=1, message="hNo should not be less than 1") //0,-1
	int hno;
	String city;
	@Size(min=5, message="Pincode should have atleast 5 digits") //16565
	@Pattern(regexp="[0-9]{5,}")
	long pincode;
}
