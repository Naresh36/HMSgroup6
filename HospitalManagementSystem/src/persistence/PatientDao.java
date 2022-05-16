package persistence;
import entity.*;
import java.util.*;
public interface PatientDao {
	int patientRegistration(Patient patient);
	List<Doctor> doctorList();
	List<Appointment> getSlots(int doctorId);
	boolean selectAppointment(int patientid, int appointmentId);
}
