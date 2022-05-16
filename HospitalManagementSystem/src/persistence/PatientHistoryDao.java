package persistence;

import java.util.List;

import entity.PatientHistory;

public interface PatientHistoryDao {
	List<PatientHistory> getMyHistoryOfCheckups();
	boolean setPatientHistory(PatientHistory patientHistory);
}
