package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.Time;

import entity.Appointment;
import entity.Doctor;
import entity.Slot;

public class DoctorDaoImpl implements DoctorDao {

	@Override
	public List<Appointment> getAllSchedule() {
		List<Appointment> appointments=new ArrayList<Appointment>();
		Statement statement=null;
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc233","root","wiley");){
			statement=connection.createStatement();
			Class.forName("com.mysql.cj.jdbc.Driver");
			ResultSet resultSet=statement.executeQuery("select * from appointment");
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				int doctorID=resultSet.getInt("doctor_id");
				int slotId=resultSet.getInt("slot_id");
				Appointment appointment=new Appointment(id,0,doctorID,slotId);
				appointments.add(appointment);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appointments;
	}

	@Override
	public Doctor getScheduleById(int id) {
		
		return null;
	}

	@Override
	public List<Slot> displaySlots() {
		List<Slot> slots=new ArrayList<Slot>();
//		Connection connection=null;
		Statement statement=null;
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc233","root","wiley");){
			statement=connection.createStatement();
			Class.forName("com.mysql.cj.jdbc.Driver");
			ResultSet resultSet=statement.executeQuery("select * from slot");
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				Time from=(Time) resultSet.getObject("from");
				Time to=(Time) resultSet.getObject("to");
				Slot slot=new Slot(id,from,to);
				slots.add(slot);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slots;
	}

	@Override
	public boolean selectSlots(int[] arr,int doctorId) {
		int rows=0;
		PreparedStatement statement=null;
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc233","root","wiley");){
			Class.forName("com.mysql.cj.jdbc.Driver");
			for(int i=0;i<arr.length;i++) {
				statement=connection.prepareStatement("update appointment set slot_id =? where doctor_id=?");
				statement.setInt(1,arr[i]);
				statement.setInt(2, doctorId);
				rows=statement.executeUpdate();
			}
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
