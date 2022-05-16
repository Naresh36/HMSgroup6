package service;

import java.util.List;

import entity.Slot;
import persistence.SlotDao;
import persistence.SlotDaoImpl;

public class SlotServiceImpl implements SlotService {

	SlotDao slotDao = new SlotDaoImpl();
	@Override
	public List<Slot> getAllSlotTimings() {
		return slotDao.getAllSlotTimings();
	}

}
