package service;

import entity.Patient;
import persistence.PatientDao;
import persistence.PatientDaoImpl;

public class PatientServiceImpl implements PatientService {

	PatientDao patientDao = new PatientDaoImpl();
	
	@Override
	public boolean registration(Patient patient) {
		
		return patientDao.patientRegistration(patient);
	}

}
