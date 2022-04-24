package presentation;
import persistence.*;
import java.util.Scanner;
public class DoctorPatientPresentationImpl implements DoctorPatientPresentation {
	DoctorPatientPresentationImpl docPatPres=new DoctorPatientPresentationImpl();
	PatientDaoImpl patientDaoImpl=new PatientDaoImpl();
	@Override
	public void showMenu() {
		System.out.println("Are you a Doctor or Patient ?");
		System.out.println("1. Doctor");
		System.out.println("2. Patient");
		System.out.println("3. Exit");
		

	}
		@Override
	public void showDoctorMenu() {
			System.out.println("1.GetMySchedule");
			System.out.println("1.GetMySchedule");
			System.out.println("2.Get All Doctors Schedule");
			System.out.println("3.Display Slots of Patient ");
			System.out.println("4.Exit");		
	}
	@Override
	public void showPatientMenu() {
		System.out.println("Enter Your Choice:");
		System.out.println("1.Registration of Patient");
		System.out.println("2.Get All Doctors Schedule");
		System.out.println("3.Get Available Slots of Doctor ");
		System.out.println("4.Book an Appointment ");
		System.out.println("5.Exit");
	}
	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:docPatPres.showDoctorMenu();
		       docPatPres.performDoctorMenu(scanner.nextInt());
				break;
		case 2:docPatPres.showPatientMenu();
		        docPatPres.performPatientMenu(scanner.nextInt());
				break;
		case 3:System.out.println("Thanks for using Hospital Management System");
				System.exit(0);
		default:System.out.println("Invalid Choice");
			
		}
		
	}
	@Override
	public void performDoctorMenu(int doctorchoice) {
		Scanner scanner=new Scanner(System.in);
		doctorchoice=scanner.nextInt();
		switch(doctorchoice)
		{
		case 1:System.out.println("Please Enter Details for Registration");
		       patientDaoImpl.patientRegistration(null);
		       break;
			
		
		}
		
	}
	@Override
	public void performPatientMenu(int patientchoice) {
		Scanner scanner=new Scanner(System.in);
		patientchoice=scanner.nextInt();
		switch(patientchoice)
		{
		
		}
	}

}
