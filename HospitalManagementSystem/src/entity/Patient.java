package entity;

public class Patient {

	private int patient_id;
	private String patient_name;
	private int patient_age;
	private String patient_gender;
	private int patient_history_id;
	
	
	public Patient() {
		super();
	}


	public Patient(int patient_id, String patient_name, int patient_age, String patient_gender,
			int patient_history_id) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_age = patient_age;
		this.patient_gender = patient_gender;
		this.patient_history_id = patient_history_id;
	}


	public int getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}


	public String getPatient_name() {
		return patient_name;
	}


	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}


	public int getPatient_age() {
		return patient_age;
	}


	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}


	public String getPatient_gender() {
		return patient_gender;
	}


	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}


	public int getPatient_history_id() {
		return patient_history_id;
	}


	public void setPatient_history_id(int patient_history_id) {
		this.patient_history_id = patient_history_id;
	}


	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_name=" + patient_name + ", patient_age=" + patient_age
				+ ", patient_gender=" + patient_gender + ", patient_history_id=" + patient_history_id + "]";
	}
	
	
	
	
}
