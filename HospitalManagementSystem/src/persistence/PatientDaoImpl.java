package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import entity.Appointment;
import entity.Patient;

public class PatientDaoImpl implements PatientDao {

	@Override
	public boolean patientRegistration(Patient patient) {
		
		PreparedStatement preparedStatement=null;
		try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc233","root","wiley");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			preparedStatement=connection.prepareStatement("insert into patient values(?,?,?,?)");
			preparedStatement.setInt(1, patient.getPatientId());
			preparedStatement.setString(2,patient.getPatientName());
			preparedStatement.setInt(3, patient.getPatientAge());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public List<Appointment> getSlots() {
		
		return null;
	}

	@Override
	public boolean selectAppointment(int slotId) {
		
		return false;
	}

}
