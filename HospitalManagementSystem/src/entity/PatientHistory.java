package entity;


import java.time.LocalDate;

public class PatientHistory {

	private int patient_history_id;
	private String patient_history_issue;
	private LocalDate localDate;
	
	private String patient_checkup_status;
	
	
	public PatientHistory() {
		super();
	}


	public PatientHistory(int patient_history_id, String patient_history_issue, LocalDate localDate, 
			String patient_checkup_status) {
		super();
		this.patient_history_id = patient_history_id;
		this.patient_history_issue = patient_history_issue;
		this.localDate = localDate;
		this.patient_checkup_status = patient_checkup_status;
	}


	public int getPatient_history_id() {
		return patient_history_id;
	}


	public void setPatient_history_id(int patient_history_id) {
		this.patient_history_id = patient_history_id;
	}


	public String getPatient_history_issue() {
		return patient_history_issue;
	}


	public void setPatient_history_issue(String patient_history_issue) {
		this.patient_history_issue = patient_history_issue;
	}


	public LocalDate getLocalDate() {
		return localDate;
	}


	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}



	public String getPatient_checkup_status() {
		return patient_checkup_status;
	}


	public void setPatient_checkup_status(String patient_checkup_status) {
		this.patient_checkup_status = patient_checkup_status;
	}


	@Override
	public String toString() {
		return "PatientHistory [patient_history_id=" + patient_history_id + ", patient_history_issue="
				+ patient_history_issue + ", localDate=" + localDate + ",  patient_checkup_status="
				+ patient_checkup_status + "]";
	}
	
	
	
}
