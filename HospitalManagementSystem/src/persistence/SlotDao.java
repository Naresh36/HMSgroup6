package persistence;

import java.util.List;

import entity.Slot;

public interface SlotDao {
	  List<Slot> getAllSlotTimings();
}
