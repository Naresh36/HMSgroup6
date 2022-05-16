package presentation;

import entity.Doctor;

public interface PatientPresentation {
	void showMenu();
	void performChoice(int choice);
	void loginOrRegister();
	void getDoctorsList();
	void bookASlot(Doctor doctor);
}
