package presentation;

import java.util.List;
import java.util.Scanner;

import entity.Doctor;
import entity.Patient;
import service.PatientService;
import service.PatientServiceImpl;

public class PatientPresentationImpl implements PatientPresentation {
	PatientService patientService = new PatientServiceImpl();
	@Override
	public void loginOrRegister() {
//		System.out.println("Previouly been on this platform? (Y/N)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to HMS");
		System.out.println("Enter you name: ");
		String name = scanner.nextLine();
		
		System.out.println("your age?");
		int age = scanner.nextInt();
		
		System.out.println("Gender? (M/F)");
		String gender = scanner.next();
		
		Patient patient = new Patient(name, age, gender);
		if(patientService.registration(patient))
			System.out.println("registration sucessful");
		else System.out.println("couldn't register!");
	}
	@Override
	public void getDoctorsList() {
		List<Doctor> list=patientService.doctorsList();
		System.out.println("Here is the list of Doctors : ");
		for(Doctor d: list) {
			System.out.println(d);
		}
		
	}

}