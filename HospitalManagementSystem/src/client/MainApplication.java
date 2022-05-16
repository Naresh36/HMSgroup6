package client;

import java.util.Scanner;

import presentation.DoctorPatientPresentation;
import presentation.DoctorPatientPresentationImpl;

public class MainApplication {

	public static void main(String[] args) {

		DoctorPatientPresentation doctorPatientPresentation = new DoctorPatientPresentationImpl();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			doctorPatientPresentation.showMenu();
			int x = scanner.nextInt();
			doctorPatientPresentation.performChoice(x);
		}
	}
}
