package client;

import presentation.PatientPresentation;
import presentation.PatientPresentationImpl;

public class MainApplication {

	public static void main(String[] args) {

		PatientPresentation patientPresentation = new PatientPresentationImpl();
		
		patientPresentation.loginOrRegister();
	}

}
