package service;

import java.util.List;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;
import persistence.PatientDao;
import persistence.PatientDaoImpl;

public class PatientServiceImpl implements PatientService {

	PatientDao patientDao = new PatientDaoImpl();
	
	@Override
	public int registration(Patient patient) {
		
		return patientDao.patientRegistration(patient);
	}

	@Override
	public List<Doctor> doctorsList() {
		// TODO Auto-generated method stub
		return patientDao.doctorList();
	}

	@Override
	public List<Appointment> getAvailableSlots(int doctorId) {
		// TODO Auto-generated method stub
		return patientDao.getSlots(doctorId);
	}

	@Override
	public boolean selectAppointment(int patientId, int appointmentId) {
		// TODO Auto-generated method stub
		return patientDao.selectAppointment(patientId, appointmentId);
	}

}
