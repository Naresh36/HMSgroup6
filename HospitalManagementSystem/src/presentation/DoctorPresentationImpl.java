package presentation;

import java.util.List;
import java.util.Scanner;

import entity.Appointment;
import entity.Slot;
import service.DoctorService;
import service.DoctorServiceImpl;
import service.SlotService;
import service.SlotServiceImpl;

public class DoctorPresentationImpl implements DoctorPresentation {

	int doctorId;
	Scanner scanner = new Scanner(System.in);
	DoctorService doctorService = new DoctorServiceImpl();
	SlotService slotService = new SlotServiceImpl();
	@Override
	public void login() {
		System.out.println("Enter your unique id:");
		this.doctorId = scanner.nextInt();
	}

	@Override
	public void getMySchedule() {
		List<Appointment> list = doctorService.getMySchedule(doctorId);
		for(Appointment appointment:list)
			System.out.println(appointment);
	}

	@Override
	public void getAllSchedules() {
		List<Appointment> list = doctorService.getAllSchedule();
		for(Appointment appointment:list)
			System.out.println(appointment);
	}

	@Override
	public void changeMySlots() {
		getMySchedule();
		System.out.println("enter appointment id to change:");
		int appointmentId = scanner.nextInt();
		System.out.println();
		List<Slot> list = slotService.getAllSlotTimings();
		for(Slot slot:list)
			System.out.println(slot);
		System.out.println("enter new slot id:");
		int slotId = scanner.nextInt();
		
		if(doctorService.updateMySlots(appointmentId, doctorId, slotId))
			System.out.println("slots changed.");
		else System.out.println("couldn't update the slots");
	}

	@Override
	public void showMenu() {
		login();
		System.out.println("1. Get my schedule");
		System.out.println("2. Get all doctors schedule");
		System.out.println("3. Change my slots");
		System.out.println("4. Exit");
	}

	@Override
	public void performChoice(int choice) {
		switch(choice)
		{
		case 1:getMySchedule();
				break;
		case 2:getAllSchedules();
				break;
		case 3:changeMySlots();
			   break;
		case 4: System.exit(0);
		default:System.out.println("Invalid Choice");
			
		}
	}

}
