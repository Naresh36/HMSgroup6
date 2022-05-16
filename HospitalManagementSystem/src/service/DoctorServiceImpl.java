package service;

import java.util.List;

import entity.Appointment;
import persistence.DoctorDao;
import persistence.DoctorDaoImpl;

public class DoctorServiceImpl implements DoctorService {

	DoctorDao doctorDao = new DoctorDaoImpl();
	@Override
	public List<Appointment> getAllSchedule() {
		return doctorDao.getAllSchedule();
	}

	@Override
	public List<Appointment> getMySchedule(int id) {
		return doctorDao.getScheduleById(id);
	}

	@Override
	public boolean updateMySlots(int appointmentId, int doctorId, int slotId) {
		return doctorDao.selectSlots(appointmentId, doctorId, slotId);
	}

}
