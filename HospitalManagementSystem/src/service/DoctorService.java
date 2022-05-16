package service;

import java.util.List;

import entity.Appointment;

public interface DoctorService {
	List<Appointment> getAllSchedule();
	List<Appointment> getMySchedule(int id);
	boolean updateMySlots(int appointmentId, int doctorId, int slotId);
}
