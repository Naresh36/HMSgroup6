package service;

import java.util.List;

import entity.Doctor;
import entity.Patient;

public interface PatientService {
	boolean registration(Patient patient);
	List<Doctor> doctorsList();
}
