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
import static persistence.ConnectionDetails.*;

public class PatientDaoImpl implements PatientDao {

	@Override
	public int patientRegistration(Patient patient) {
		
		PreparedStatement preparedStatement=null;
		int rows=0, patientId = 0;
		try(Connection connection= DriverManager.getConnection(jdbcConnection, jdbcUser, jdbcPassword);){
			Class.forName("com.mysql.cj.jdbc.Driver");
			preparedStatement=connection.prepareStatement("insert into patient(name, age, gender) values(?,?,?)");
			preparedStatement.setString(1,patient.getPatientName());
			preparedStatement.setInt(2, patient.getPatientAge());
			preparedStatement.setString(3, patient.getPatientGender());
			rows=preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.executeQuery("select id from patient order by id desc limit 0, 1");
			rs.next();
			patientId = rs.getInt("id");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if(rows>0) {
			return patientId;
		}
		return 0;
	}

	@Override
	public List<Appointment> getSlots(int doctorId) {
		
		List<Appointment> slots=new ArrayList<>();
		Statement statement=null;
		try(Connection connection=DriverManager.getConnection(jdbcConnection, jdbcUser, jdbcPassword);){
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
	public boolean selectAppointment(int patientId, int appointmentId) {
		
//		Patient patient=new Patient();
		int rows=0;
		PreparedStatement statement=null;
		try(Connection connection=DriverManager.getConnection(jdbcConnection, jdbcUser, jdbcPassword);){
			Class.forName("com.mysql.cj.jdbc.Driver");
			statement=connection.prepareStatement("update appointment set patient_id =? where id = ?");
			statement.setInt(1,patientId);
			statement.setInt(2, appointmentId);
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
		
		try(Connection connection=DriverManager.getConnection(jdbcConnection, jdbcUser, jdbcPassword);){
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
