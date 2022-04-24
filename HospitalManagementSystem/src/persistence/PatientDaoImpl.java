package persistence;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import entity.Appointment;
import entity.Doctor;
import entity.Patient;

public class PatientDaoImpl implements PatientDao {

	@Override
	public boolean patientRegistration(Patient patient) {
		
		PreparedStatement preparedStatement=null;
		int rows=0;
		try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc233","root","wiley");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			preparedStatement=connection.prepareStatement("insert into patient values(?,?,?,?)");
			preparedStatement.setInt(1, patient.getPatientId());
			preparedStatement.setString(2,patient.getPatientName());
			preparedStatement.setInt(3, patient.getPatientAge());
			preparedStatement.setString(4, patient.getPatientGender());
			rows=preparedStatement.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if(rows>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Appointment> getSlots(int doctorId) {
		
		List<Appointment> slots=new ArrayList<>();
		Statement statement=null;
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc233","root","wiley");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select id,doctor_id,slot_id from appointment where doctor_id ="+doctorId+" and patient_id is null");
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				int doctorID=resultSet.getInt("doctor_id");
				int slotId=resultSet.getInt("slot_id");
				Appointment appointment=new Appointment(id,0,doctorID,slotId);
				slots.add(appointment);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return slots;
	}

	@Override
	public boolean selectAppointment(int slotId,int patientid) {
		
//		Patient patient=new Patient();
		int rows=0;
		PreparedStatement statement=null;
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc233","root","wiley");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			statement=connection.prepareStatement("update appointment set patient_id =? where slot_id=?");
			statement.setInt(1,patientid);
			statement.setInt(2, slotId);
			rows=statement.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if(rows>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Doctor> doctorList() {
		List<Doctor> doctors=new ArrayList<>();
		Statement statement=null;
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc233","root","wiley");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from doctor");
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				String name=resultSet.getString("name");
				int age=resultSet.getInt("age");
				String gender=resultSet.getString("gender");
				String specialization=resultSet.getString("specialization");
				String number=resultSet.getString("contact_no");
				Doctor doctor=new Doctor(id,name,age,gender,specialization,number);
				doctors.add(doctor);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return doctors;
	}

}
