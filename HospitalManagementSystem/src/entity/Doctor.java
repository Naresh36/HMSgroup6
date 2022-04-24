package entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Doctor {

	private int doctorId;
	private String doctorName;
	private int doctorAge;
	private String doctorGender;
	private String doctorSpecialization;
	private int doctorContactNo;
	
	



}
