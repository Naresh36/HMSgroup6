package service;

import java.util.List;

import entity.Doctor;
import entity.Patient;
import persistence.PatientDao;
import persistence.PatientDaoImpl;

public class PatientServiceImpl implements PatientService {

	PatientDao patientDao = new PatientDaoImpl();
	
	@Override
	public boolean registration(Patient patient) {
		
		return patientDao.patientRegistration(patient);
	}

	@Override
	public List<Doctor> doctorsList() {
		// TODO Auto-generated method stub
		return patientDao.doctorList();
	}

}
