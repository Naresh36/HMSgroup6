package persistence;

import static persistence.ConnectionDetails.jdbcConnection;
import static persistence.ConnectionDetails.jdbcPassword;
import static persistence.ConnectionDetails.jdbcUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import entity.Appointment;
import entity.Slot;

public class DoctorDaoImpl implements DoctorDao {

	@Override
	public List<Appointment> getAllSchedule() {
		List<Appointment> appointments=new ArrayList<Appointment>();
		Statement statement=null;
		try(Connection connection=DriverManager.getConnection(jdbcConnection, jdbcUser, jdbcPassword);){
			statement=connection.createStatement();
			Class.forName("com.mysql.cj.jdbc.Driver");
			ResultSet resultSet=statement.executeQuery("select * from appointment");
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				int patientId = resultSet.getInt("patient_id");
				int doctorID=resultSet.getInt("doctor_id");
				int slotId=resultSet.getInt("slot_id");
				Appointment appointment=new Appointment(id,patientId,doctorID,slotId);
				appointments.add(appointment);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return appointments;
	}

	@Override
	public List<Appointment> getScheduleById(int doctorId) {
		List<Appointment> appointments=new ArrayList<Appointment>();
		Statement statement=null;
		try(Connection connection=DriverManager.getConnection(jdbcConnection, jdbcUser, jdbcPassword);){
			statement=connection.createStatement();
			Class.forName("com.mysql.cj.jdbc.Driver");
			ResultSet resultSet=statement.executeQuery("select * from appointment where doctor_id = " + doctorId);
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				int patientId = resultSet.getInt("patient_id");
				int doctorID=resultSet.getInt("doctor_id");
				int slotId=resultSet.getInt("slot_id");
				Appointment appointment=new Appointment(id,patientId,doctorID,slotId);
				appointments.add(appointment);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return appointments;
	}

	@Override
	public boolean selectSlots(int appointmentId, int doctorId, int slotId) {
		int rows=0;
		PreparedStatement statement=null;
		try(Connection connection=DriverManager.getConnection(jdbcConnection, jdbcUser, jdbcPassword);){
			Class.forName("com.mysql.cj.jdbc.Driver");
			statement=connection.prepareStatement("update appointment set slot_id =? where doctor_id=? and id = ?");
			statement.setInt(1,slotId);
			statement.setInt(2, doctorId);
			statement.setInt(3, appointmentId);
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

}
