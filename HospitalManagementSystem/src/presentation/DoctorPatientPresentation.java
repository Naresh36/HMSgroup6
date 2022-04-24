package presentation;

public interface DoctorPatientPresentation {

	void showMenu();
	void showDoctorMenu();
	void showPatientMenu();
	void performMenu(int choice);
	void performDoctorMenu(int doctorchoice);
	void performPatientMenu(int patientchoice);
	
}
