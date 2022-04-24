package entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Appointment {

	private int appointmentId;
	private int patientId;
	private int doctorId;
	private int slotId;
	
	

	
}
