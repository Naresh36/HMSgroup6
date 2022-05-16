package presentation;

import java.util.List;
import java.util.Scanner;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;
import entity.Slot;
import service.PatientService;
import service.PatientServiceImpl;
import service.SlotService;
import service.SlotServiceImpl;
import service.SlotService;
import service.SlotServiceImpl;

public class PatientPresentationImpl implements PatientPresentation {
	PatientService patientService = new PatientServiceImpl();
	SlotService slotService = new SlotServiceImpl();
	int patientId;
	Scanner scanner = new Scanner(System.in);;
	@Override
	public void loginOrRegister() {
		System.out.println("Welcome to HMS");
		System.out.println("Previouly been on this platform? (Y/N)");
		char c = scanner.next().charAt(0);
		if(c == 'N') {
			System.out.println("Enter you name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("your age?");
			int age = scanner.nextInt();
			
			System.out.println("Gender? (M/F)");
			String gender = scanner.next();
			
			Patient patient = new Patient(name, age, gender);
			int id = patientService.registration(patient);
			patientId = id;
			if(id != 0)
				System.out.println("registration sucessful \n"
						+ "Your unique id is " + id + "\nRemember it for future reference");
			else System.out.println("couldn't register!");
		}
		else if(c == 'Y'){
			System.out.println("Enter your unique id");
			int id = scanner.nextInt();
			patientId = id;
		}else
			System.out.println("Invalid option!");
	}
	@Override
	public void getDoctorsList() {
		List<Doctor> list=patientService.doctorsList();
		System.out.println("Here is the list of Doctors : ");
		for(Doctor d: list) {
			System.out.println(d);
		}
		System.out.println("Enter the doctor Id of that doctor you want to get check up with: ");
		bookASlot(list.get(scanner.nextInt() - 1));
	}
	@Override
	public void bookASlot(Doctor doctor) {
		
		List<Slot> slots = slotService.getAllSlotTimings();
		System.out.println("select from these available slots for doctor: "+ doctor.getDoctorName());
		List<Appointment> list = patientService.getAvailableSlots(doctor.getDoctorId());
		for(Appointment appointment : list)
			System.out.println(appointment);
		System.out.println("Slots timings are: ");
		for(Slot slot:slots)
			System.out.println(slot);
		System.out.println("enter the appointmentId");
		int appointmentId = scanner.nextInt();
		if(patientService.selectAppointment(patientId, appointmentId))
			System.out.println("Slot booked");
		else System.out.println("couldn't book slot");
	}
	@Override
	public void showMenu() {
		loginOrRegister();
		System.out.println("1. Get doctors list");
		System.out.println("2. My History:");
		System.out.println("3. Exit");
	}
	@Override
	public void performChoice(int choice) {
		switch(choice)
		{
		case 1:getDoctorsList();
				break;
		case 2:
				System.out.println("still in developing phase");
				break;
		case 3: System.exit(0);
		default:System.out.println("Invalid Choice");
			
		}
	}

}