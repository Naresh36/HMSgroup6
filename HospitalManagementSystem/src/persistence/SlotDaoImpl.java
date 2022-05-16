package persistence;

import static persistence.ConnectionDetails.jdbcConnection;
import static persistence.ConnectionDetails.jdbcPassword;
import static persistence.ConnectionDetails.jdbcUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import entity.Appointment;
import entity.Slot;

public class SlotDaoImpl implements SlotDao {

	@Override
	public List<Slot> getAllSlotTimings() {
		List<Slot> slots=new ArrayList<>();
		Statement statement=null;
		try(Connection connection=DriverManager.getConnection(jdbcConnection, jdbcUser, jdbcPassword);){
			Class.forName("com.mysql.cj.jdbc.Driver");
			statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from slot");
			while(resultSet.next()) {
				int id=resultSet.getInt("id");
				Time from =resultSet.getTime("from");
				Time to=resultSet.getTime("to");
				Slot slot = new Slot(id, from, to);
				slots.add(slot);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return slots;
	}

}
