package persistence;
import entity.*;
import java.util.*;
public interface PatientDao {
	boolean patientRegistration(Patient patient);
	List<Doctor> doctorList();
	List<Appointment> getSlots(int doctorId);
	boolean selectAppointment(int slotId,int patientid);
}
