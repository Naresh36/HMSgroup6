package entity;

public class Doctor {

	private int doctor_id;
	private String doctor_name;
	private int doctor_age;
	private String doctor_gender;
	private String doctor_specialization;
	private int doctor_contact_no;
	
	
	public Doctor() {
		super();
	}
	
	public Doctor(int doctor_id, String doctor_name, int doctor_age, String doctor_gender, String doctor_specialization,
			 int doctor_contact_no) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.doctor_age = doctor_age;
		this.doctor_gender = doctor_gender;
		this.doctor_specialization = doctor_specialization;
		this.doctor_contact_no = doctor_contact_no;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public int getDoctor_age() {
		return doctor_age;
	}
	public void setDoctor_age(int doctor_age) {
		this.doctor_age = doctor_age;
	}
	public String getDoctor_gender() {
		return doctor_gender;
	}
	public void setDoctor_gender(String doctor_gender) {
		this.doctor_gender = doctor_gender;
	}
	public String getDoctor_specialization() {
		return doctor_specialization;
	}
	public void setDoctor_specialization(String doctor_specialization) {
		this.doctor_specialization = doctor_specialization;
	}
	
	public int getDoctor_contact_no() {
		return doctor_contact_no;
	}
	public void setDoctor_contact_no(int doctor_contact_no) {
		this.doctor_contact_no = doctor_contact_no;
	}
	@Override
	public String toString() {
		return "Doctor [doctor_id=" + doctor_id + ", doctor_name=" + doctor_name + ", doctor_age=" + doctor_age
				+ ", doctor_gender=" + doctor_gender + ", doctor_specialization=" + doctor_specialization
				+ ", doctor_contact_no=" + doctor_contact_no + "]";
	}
	
	
	
	



}
