package service;

import java.util.List;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;

public interface PatientService {
	int registration(Patient patient);
	List<Doctor> doctorsList();
	List<Appointment> getAvailableSlots(int doctorId);
	boolean selectAppointment(int patientId, int appointmentId);
}
