package presentation;

import java.util.Scanner;

public class DoctorPatientPresentationImpl implements DoctorPatientPresentation {

	DoctorPresentation doctorPresentation = new DoctorPresentationImpl();
	PatientPresentation patientPresentation = new PatientPresentationImpl();
	Scanner scanner = new Scanner(System.in);
	@Override
	public void showMenu() {
		System.out.println("\nAre you a Doctor or Patient ?");
		System.out.println("1. Doctor");
		System.out.println("2. Patient");
		System.out.println("3. Exit");
	}

	@Override
	public void performChoice(int choice) {
		switch(choice)
		{
		case 1:
			doctorPresentation.showMenu();
			int x = scanner.nextInt();
			doctorPresentation.performChoice(x);
			break;
		case 2:
			patientPresentation.showMenu();
			int y = scanner.nextInt();
			patientPresentation.performChoice(y);
			break;
		case 3:
				System.exit(0);
		default:System.out.println("Invalid Choice");
			
		}		
	}

}
