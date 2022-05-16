package entity;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class PatientHistory {

	private int patientHistoryId;
	private String patientHistoryIssue;
	private LocalDate localDate;
	private String patientCheckupStatus;
}
