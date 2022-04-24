package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Patient {

	private int patientId;
	private String patientName;
	private int patientAge;
	private String patientGender;
	private int patientHistoryId;
	
	

	
	
	
}
