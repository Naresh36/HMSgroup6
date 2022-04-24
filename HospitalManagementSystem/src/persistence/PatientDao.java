package persistence;
import entity.*;
import java.util.*;
public interface PatientDao {
	boolean patientRegistration(Patient patient);
	List<Appointment> getSlots();
	boolean selectAppointment(int slotId);
}
