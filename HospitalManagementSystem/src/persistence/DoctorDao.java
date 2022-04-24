package persistence;
import entity.*;
import java.util.*;
public interface DoctorDao {
	List<Doctor> getAllSchedule();
	Doctor getScheduleById(int id);
	List<Slot> displaySlots();
	boolean selectSlots(int arr[]);
}
