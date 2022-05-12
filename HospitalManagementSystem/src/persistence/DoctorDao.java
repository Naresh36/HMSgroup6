package persistence;
import entity.*;
import java.util.*;

public interface DoctorDao {
	List<Appointment> getAllSchedule();
	Doctor getScheduleById(int id);
	List<Slot> displaySlots();
	boolean selectSlots(int arr[],int doctorId);
}
