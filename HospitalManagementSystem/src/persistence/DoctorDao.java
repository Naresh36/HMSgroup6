package persistence;
import entity.*;
import java.util.*;

public interface DoctorDao {
	List<Appointment> getAllSchedule();
	List<Appointment> getScheduleById(int id);
	boolean selectSlots(int appointmentId, int doctorId, int slotId);
}
