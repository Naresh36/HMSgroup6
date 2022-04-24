package entity;

public class Appointment {

	private int appointment_id;
	private int patient_id;
	private int doctor_id;
	private int slot_id;
	
	
	public Appointment() {
		super();
	}


	public Appointment(int appointment_id, int patient_id, int doctor_id, int slot_id) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.slot_id = slot_id;
	}


	public int getAppointment_id() {
		return appointment_id;
	}


	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}


	public int getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}


	public int getDoctor_id() {
		return doctor_id;
	}


	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}


	public int getSlot_id() {
		return slot_id;
	}


	public void setSlot_id(int slot_id) {
		this.slot_id = slot_id;
	}


	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", patient_id=" + patient_id + ", doctor_id="
				+ doctor_id + ", slot_id=" + slot_id + "]";
	}
	
	
	
}
